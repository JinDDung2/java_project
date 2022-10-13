package codeup;

import java.util.Scanner;

public class Code1066 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] intList = new int[3];
        intList[0] = scanner.nextInt();
        intList[1] = scanner.nextInt();
        intList[2] = scanner.nextInt();

        for (int i : intList) {
            if (i % 2 == 0) {
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }

    }
}

