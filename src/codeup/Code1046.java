package codeup;

import java.util.Scanner;

public class Code1046 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();

        System.out.println(firstNum+secondNum+thirdNum);

        double hap = firstNum+secondNum+thirdNum;
        System.out.println(String.format("%.1f", hap/3));

    }
}

