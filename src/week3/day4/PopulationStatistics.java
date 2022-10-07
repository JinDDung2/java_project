package week3.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    public List<PopulationMove> readByLine(String fileName) throws  IOException{
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );
        String fileContents;
        while ((fileContents = reader.readLine()) != null) {
//            System.out.println(fileContents);
            PopulationMove pm = parse(fileName);
        }
        reader.close();
        return pml;
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

    public PopulationMove parse(String data) {

        String[] arr = data.split(",");
        return new PopulationMove(arr[0], arr[6]);
    }

    public void createAFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }

}
