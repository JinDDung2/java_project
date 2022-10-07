package week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    DoSomething<T> doSomething;

    public List<PopulationMove> readFileByLine(String fileName) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String str1 = "";
        String temp;

        while ( (temp = reader.readLine()) != null) {
            System.out.println(temp);
            str1 += temp;
        }
        reader.close();
        System.out.println(result);
        return null;
    }

}
