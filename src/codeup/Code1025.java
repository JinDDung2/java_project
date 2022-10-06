package codeup;

import java.util.Scanner;

public class Code1025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] charList = str.toCharArray();
        System.out.println("[" + charList[0] + "0000]");
        System.out.println("[" + charList[1] + "000]");
        System.out.println("[" + charList[2] + "00]");
        System.out.println("[" + charList[3] + "0]");
        System.out.println("[" + charList[4] + "]");


    }
}

