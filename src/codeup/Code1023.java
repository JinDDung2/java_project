package codeup;

import java.util.Scanner;

public class Code1023 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double num = sc.nextDouble();

        String str = num.toString();
        String[] strList = str.split("\\.");
        for (String s : strList) {
            System.out.println(s);
        }
    }

}
