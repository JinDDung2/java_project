package week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

// fileReader.read()는 한 바이트씩 읽는 것 --> 모래를 한 알씩 옮기는 것으로 오래걸림
public class PopulationStatistics {
    public static void main(String[] args) throws IOException {

        String address = "/Users/jinhyuck/Downloads/2021_인구관련연간자료_20221007_89221.csv";
        BufferedReader reader = new BufferedReader(new FileReader(address));

        char ch = (char) reader.read();
        System.out.println(ch);
//        String fileContents = "";
//        readByChar(address);

    }

    public void readByChar(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        String fileContents = "";
        while (fileContents.length() < 100000) {
            char ch = (char) reader.read();
            fileContents += ch;
        }
        reader.close();
    }

    public void readByLine(String fileName) throws  IOException{
        BufferedReader reader = new BufferedReader(
                new FileReader("d:\\file.txt")
        );
        String fileContents;
        while ((fileContents = reader.readLine()) != null) {
            System.out.println(fileContents);
        }
        reader.close();
    }


    public void readByLine2(String fileName) {
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

}
