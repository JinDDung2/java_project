package week3.day4;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String address = "/Users/jinhyuck/Downloads/2021_인구관련연간자료_20221007_89221.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        populationStatistics.createAFile("from_to.txt");

    }
}
