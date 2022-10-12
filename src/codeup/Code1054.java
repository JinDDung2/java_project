package codeup;

import java.util.Scanner;

public class Code1054 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        String[] numArr = num.split(" ");
        int firstNum = Integer.parseInt(numArr[0]);
        int secondNum = Integer.parseInt(numArr[1]);

        if (firstNum == 1 || secondNum == 1) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}

