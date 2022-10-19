package codeup;

import java.util.Scanner;

public class Code1093 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] numList = new int[23];

        for (int i = 0; i < a; i++) {
            int idx = sc.nextInt();
            numList[idx-1] += 1;
        }

        for (int i : numList) {
            System.out.printf("%d ", i);
        }
    }
}

