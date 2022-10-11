package codeup;

import java.util.Scanner;

public class Code1045 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println(firstNum+secondNum);
        System.out.println(firstNum-secondNum);
        System.out.println(firstNum*secondNum);
        System.out.println(firstNum/secondNum);
        System.out.println(firstNum%secondNum);
        double A = (double) firstNum;
        System.out.println(String.format("%.2f", A/secondNum));

    }
}

