package week3.day4;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    // 생성자에 맴버변수 2개 받기
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    // 데이터 가공 메서드
    public String[] getData(String data) {
        String[] dataList = data.split(",");
        return dataList;
    }
    // 1: 전입행정구역시도코드, 7:전출행정구역시도코드
    public PopulationMove parse (String[] dataList) {
        int fromSido = Integer.parseInt(dataList[0]);
        int toSido = Integer.parseInt(dataList[6]);
        return new PopulationMove(fromSido, toSido);
    }


    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}
