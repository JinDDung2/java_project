package codeup;

import java.util.Scanner;

public class Code1051 {

    public static int compare(int firstNum, int secondNum) {
        return firstNum > secondNum ? 0 : 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        int compareNum = compare(firstNum, secondNum);
        System.out.println(compareNum);

    }
}

