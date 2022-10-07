package week3.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// fileReader.read()는 한 바이트씩 읽는 것 --> 모래를 한 알씩 옮기는 것으로 오래걸림
public class PopulationStatistics {

    // 한 바이트씩 읽는 메서드 (100만글자까지)
    public void readByChar(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        String fileContents = "";
        while (fileContents.length() < 1000000) {
            char ch = (char) reader.read();
            fileContents += ch;
        }
        reader.close();
    }

    // 파일을 한 줄씩 읽어 파일의 모든 내용을 읽는 메서드
    public List<PopulationMove> readByLine(String fileName) throws IOException{
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String fileContents = "";

        //while문 안에서 string을 PopulationMove로 파싱하여 pml에 추가
        //루프가 끝나면 return 합니다.
        while ((fileContents = reader.readLine()) != null) {
            // System.out.println(fileContents);
            PopulationMove pm = parseV1(fileContents);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    // 에러를 try catch
    public void readByLineV2(String fileName) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName),
                StandardCharsets.UTF_8)) {
            String fileContents;
            while ((fileContents=reader.readLine()) != null) {
                System.out.println(fileContents);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // PopulationMove 파싱 메서드 1
    public PopulationMove parseV1(String data) {
        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[6]);
    }

    // PopulationMove 파싱 메서드 2
    public PopulationMove parseV2(String data) {
        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[1]);
    }

    // 필요한 데이터만 추출하기 위한 새 파일 만들기
    public void createAFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    // 새 파일에 내용 추가 후 파일이름 저장
    public void write(List<String> strs, String fileName) throws IOException{
        File file = new File(fileName);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : strs) {
            writer.write(str);
        }
        writer.close();
    }

    // PopulationMove 객체 안에 데이터들을 String으로 변환
    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getFromSido() + "\n";
    }

    // 도시 이동에 대한 각각의 개수 찾기
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getToSido() + "," + pm.getFromSido();
            // key에 해당하는 값이 없다면 디폴트 값을 0으로 지정, 키가 중복된다면 값 +1 반복
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
//            moveCntMap.getOrDefault(key, moveCntMap.getOrDefault(key, 0) + 1);
        }
        return moveCntMap;
    }


    public static void main(String[] args) throws IOException {
//        String address = "/Users/jinhyuck/Downloads/2021_인구관련연간자료_20221007_89221.csv";
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        Map<String, Integer> moveCntMap = populationStatistics.getMoveCntMap(pml);
        System.out.println(moveCntMap);

        String targetFilename = "each_sido_cnt.txt";
        populationStatistics.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) {
            String str = String.format("key:%s value:%d\n", key, moveCntMap.get(key));
            cntResult.add(str);
        }
        populationStatistics.write(cntResult, targetFilename);
    }

        // 파일 읽어 쓰기
        /*List<String> strings = new ArrayList<>();
        for (PopulationMove pm : pml) {
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
            System.out.printf("전입: %s, 전출: %s \n", pm.getFromSido(), pm.getToSido());
        }
        populationStatistics.write(strings, "./from_to.txt");
    }*/

}
