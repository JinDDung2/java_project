package codeup;

import java.util.Scanner;

public class Code1027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strList = str.split("\\.");
        System.out.printf("%s-%s-%s", strList[2], strList[1], strList[0]);


    }
}

