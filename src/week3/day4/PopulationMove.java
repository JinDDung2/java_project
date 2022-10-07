package week3.day4;

import week3.day3.file.ReadFile;

import java.util.Map;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    // 생성자에 맴버변수 2개 받기
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    // 생성자 오버로딩(int --> String)
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    // 1: 전입행정구역시도코드, 7:전출행정구역시도코드
    public PopulationMove parse (String data) {
        String[] dataList = data.split(",");
        int fromSido = Integer.parseInt(dataList[0]);
        int toSido = Integer.parseInt(dataList[6]);
        return new PopulationMove(fromSido, toSido);
    }

    // sido를 매핑하는 메서드
    public Map<Integer, String> sidoMap(Map<Integer, String> sidoName) {
        sidoName.put(11, "서울특별시");
        sidoName.put(21, "부산광역시");
        sidoName.put(22, "대구광역시");
        sidoName.put(23, "인천광역시");
        sidoName.put(24, "광주광역시");
        sidoName.put(25, "대전광역시");
        sidoName.put(26, "울산광역시");
        sidoName.put(29, "세종특별자치시");
        sidoName.put(31, "경기도");
        sidoName.put(32, "강원도");
        sidoName.put(33, "충청북도");
        sidoName.put(34, "충청남도");
        sidoName.put(35, "전라북도");
        sidoName.put(36, "전라남도");
        sidoName.put(37, "경상북도");
        sidoName.put(38, "경상남도");
        sidoName.put(39, "제주특별자치도");
        return sidoName;
    }


    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}
