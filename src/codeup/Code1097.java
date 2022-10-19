package codeup;

import java.util.Scanner;

public class Code1097 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] board = new int[19][19];
        for(int i = 0; i < 19; i++) {
            String aLine = sc.nextLine();
            String[] aLineSplit = aLine.split(" ");
            for(int j = 0; j < 19; j++) {
                board[i][j] = Integer.parseInt(aLineSplit[j]);
            }
        }

        int numOfWhite = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numOfWhite; i++) {
            String inputXY = sc.nextLine();
            String[] xySplit = inputXY.split(" ");
            int x = Integer.parseInt(xySplit[0]) - 1;
            int y = Integer.parseInt(xySplit[1]) - 1;

            for(int j = 0; j < 19; j++) {
                if(board[x][j] == 1) {
                    board[x][j] = 0;
                }
                else {
                    board[x][j] = 1;
                }
            }
            for(int k = 0; k < 19; k++) {
                if(board[k][y] == 0) {
                    board[k][y] = 1;
                }
                else {
                    board[k][y] = 0;
                }
            }
        }

        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

