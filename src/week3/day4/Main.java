package week3.day4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String address = "/Users/jinhyuck/Downloads/2021_인구관련연간자료_20221007_89221.csv";
//        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        // 파일을 원하는 데이터로 가공
        /*List<String> strings = new ArrayList<>();
        for (PopulationMove pm : pml) {
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
//            System.out.printf("전입: %s, 전출: %s \n", pm.getToSido(), pm.getFromSido()); // 확인용
        }
        populationStatistics.write(strings, "./from_to.txt");*/

        // 도시 이동에 대한 개수 (전입,전출, 이동수)
        Map<String, Integer> moveCntMap = populationStatistics.getMoveCntMap(pml);
        Map<String, Integer> heatmap = populationStatistics.heatmapIdxMap();
        System.out.println(moveCntMap);

        // 새로운 파일에 전입,전출,이동수 를 저장
        String targetFilename = "each_sido_cnt.txt";
        String heatmapFilename = "for_heatmap.txt";
        populationStatistics.createAFile(targetFilename);
        populationStatistics.createAFile(heatmapFilename);

        List<String> cntResult = new ArrayList<>();

        // each_sido_cnt.txt 만들기
        /*for (String key : moveCntMap.keySet()) {
            String str = String.format("key:%s value:%d\n", key, moveCntMap.get(key));
            cntResult.add(str);
        }
        populationStatistics.write(cntResult, targetFilename);*/

        // for_heatmap.txt 만들기
        for (String key : moveCntMap.keySet()) {
            String[] fromto = key.split(",");
            String str = String.format("[%s, %s, %d],\n",
                    heatmap.get(fromto[0]), heatmap.get(fromto[1]), moveCntMap.get(key));
            System.out.println(str);
            cntResult.add(str);
        }
        populationStatistics.write(cntResult, heatmapFilename);
    }
}
