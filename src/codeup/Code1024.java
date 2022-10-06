package codeup;

import java.util.Scanner;

public class Code1024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charList = new char[str.length()];

        for (int i=0; i<str.length(); i++) {
            charList[i] = (char) str.charAt(i);
        }

        for (char c : charList) {
            System.out.printf("\'%c\'\n", c);
        }

    }
}
