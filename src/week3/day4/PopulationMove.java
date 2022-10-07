package week3.day4;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private int toSido; // 전입
    private int fromSido; // 전출

    static Map<Integer, String> sidoMap = new HashMap<>();

    // 생성자에 맴버변수 2개 받기

    // int 데이터를 받을 때 생성자
    public PopulationMove(int toSido, int fromSido) {
        this.toSido = toSido;
        this.fromSido = fromSido;
    }

    // String 데이터를 받을 때 int 타입으로 변환한 생성자
    public PopulationMove(String toSido, String fromSido) {
        this.toSido = Integer.parseInt(toSido);
        this.fromSido = Integer.parseInt(fromSido);
    }

    public static String sidoMapping (int code) {
        HashMap<Integer, String> sidoMap = new HashMap<>();

        sidoMap.put(11, "서울특별시");
        sidoMap.put(26, "부산광역시");
        sidoMap.put(27, "대구광역시");
        sidoMap.put(28, "인천광역시");
        sidoMap.put(29, "광주광역시");
        sidoMap.put(30, "대전광역시");
        sidoMap.put(31, "울산광역시");
        sidoMap.put(36, "세종특별자치시");
        sidoMap.put(41, "경기도");
        sidoMap.put(42, "강원도");
        sidoMap.put(43, "충청북도");
        sidoMap.put(44, "충청남도");
        sidoMap.put(45, "전라북도");
        sidoMap.put(46, "전라남도");
        sidoMap.put(47, "경상북도");
        sidoMap.put(48, "경상남도");
        sidoMap.put(50, "제주특별자치도");

        return sidoMap.get(code);
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}
