package week3.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// fileReader.read()는 한 바이트씩 읽는 것 --> 모래를 한 알씩 옮기는 것으로 오래걸림
public class PopulationStatistics {

    public void readByChar(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        String fileContents = "";
        while (fileContents.length() < 100000) {
            char ch = (char) reader.read();
            fileContents += ch;
        }
        reader.close();
    }

    //while문 안에서 string을 PopulationMove로 파싱하여 pml에 추가
    //루프가 끝나면 return 합니다.
    public List<PopulationMove> readByLine(String fileName) throws IOException{
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );
        String fileContents;
        while ((fileContents = reader.readLine()) != null) {
//            System.out.println(fileContents);
            PopulationMove pm = parse(fileContents);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }


    public void readByLineV2(String fileName) {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8
        )) {
            String fileContents;
            while ((fileContents=reader.readLine()) != null) {
                System.out.println(fileContents);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[1]);
    }

    public void createAFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void write(List<String> strs, String fileName) throws IOException{
        File file = new File(fileName);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : strs) {
            writer.write(str);
        }
        writer.close();
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getFromSido() + "\n";
    }


    public static void main(String[] args) throws IOException {
        String address = "/Users/jinhyuck/Downloads/2021_인구관련연간자료_20221007_89221.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        // 파일저장
//        populationStatistics.createAFile("/from_to.txt");
        List<String> strings = new ArrayList<>();
        for (PopulationMove pm : pml) {
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
//            System.out.printf("전입: %s, 전출: %s \n", pm.getFromSido(), pm.getToSido());
        }
//        System.out.println(pml.size());
        populationStatistics.write(strings, "./from_to.txt");
    }

}
