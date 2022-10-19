package codeup;

import java.util.Scanner;

public class Code1096 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] numList = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                numList[i][j] = 0;
            }
        }

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            numList[a][b] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", numList[i][j]);
            }
            System.out.println();
        }
    }
}

