package codeup;

import java.util.Scanner;

public class Code1076 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        char a = 'a';

        while (a <= ch) {
            System.out.print(a + " ");
            a += 1;
        }


    }
}



