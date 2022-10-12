package codeup;

import java.util.Scanner;

public class Code1055 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fistNum = sc.nextInt();
        int secondNum = sc.nextInt();

        if (fistNum == 1 && secondNum == 1) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}

