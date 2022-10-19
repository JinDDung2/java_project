package codeup;

import java.util.Scanner;

public class Code1098 {

    public static void main(String[] args) {

        // 세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l),
        // d:가로는 0, 세로는 1
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] board = new int[h][w];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < l; j++) {
                if (d == 0) // 가로
                    board[x-1][y-1+j] = 1;
                else
                    board[x-1+j][y-1] = 1;
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

