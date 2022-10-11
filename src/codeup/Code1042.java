package codeup;

import java.util.Scanner;

public class Code1042 {

    public static int divide(int first, int second) {
        return first/second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int result = divide(firstNum, secondNum);
        System.out.println(result);


    }
}

