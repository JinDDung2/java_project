package codeup;

import java.util.Scanner;

public class Code1094 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] numList = new int[10000];

        for (int i = 0; i < a; i++) {
            int idx = sc.nextInt();
            numList[i] = idx;
        }

        for (int i = a-1; i >= 0; i--) {
            System.out.printf("%d ", numList[i]);
        }
    }
}

