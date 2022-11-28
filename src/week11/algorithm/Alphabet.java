package week11.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {
    public static void print() {
        List<String> list = new ArrayList<>();
        for (int i = 65; i <=90; i++) {
            char c = (char) i;
            System.out.println(c);

        }
    }

    public static void main(String[] args) {
        print();
    }
}
