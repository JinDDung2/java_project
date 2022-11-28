package week11.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {
    public static void print() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 65; i <=90; i++) {
            char c = (char) i;
//            System.out.println(c);
            list.add(String.valueOf(c));
        }

        for (int i = 0; i < list.size(); i++) {
            for (String s : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(list.get(i));
                sb.append(s);
                list2.add(String.valueOf(sb));
            }
        }
        System.out.println("list2 = " + list2);
    }

    public static void main(String[] args) {
        print();
    }
}
