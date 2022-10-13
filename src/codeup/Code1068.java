package codeup;

import java.util.Scanner;

public class Code1068 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num >= 90) {
            System.out.println("A");
        } else if (num < 90 && num >=70) {
            System.out.println("B");
        } else if (num < 70 && num>=40) {
            System.out.println("C");
        } else if (num < 40) {
            System.out.println("D");
        }

    }
}

