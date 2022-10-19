package codeup;

import java.util.Scanner;

public class Code1095 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] numList = new int[10000];
        int minNum = 24;

        for (int i = 0; i < a; i++) {
            int idx = sc.nextInt();
            numList[i] = idx;
        }

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] != 0) {
                minNum = Math.min(minNum, numList[i]);
            }
        }
        System.out.println(minNum);
    }
}

