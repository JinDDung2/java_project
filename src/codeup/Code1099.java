package codeup;

import java.util.Scanner;

public class Code1099 {

    public static void main(String[] args) {

        // 0(갈 수 있는 곳), 1(벽 또는 장애물), 2(먹이) 9(방문)
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;

        while (true) {
            if (board[x][y] == 2) {
                board[x][y] = 9;
                break;
            }else {
                board[x][y] = 9;
            }

            if (x < 9 && y < 9 && board[x][y+1] != 1) {
                y++;
            }else if (x < 9 && y < 9 && board[x+1][y] != 1) {
                x++;
            } else break;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }

    }
}

