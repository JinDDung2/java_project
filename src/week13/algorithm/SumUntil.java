package week13.algorithm;

import java.util.Arrays;

public class SumUntil {
    public static void sumUntil(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];

        /*for (int i = 0; i < arr.length; i++) {
            dp[i][i] = arr[i];
        }*/

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= j) {
                    dp[i][j] += arr[j];
                }
            }
            /*ints = [2, 7, 40, 19]
            ints = [0, 7, 40, 19]
            ints = [0, 0, 40, 19]
            ints = [0, 0, 0, 19]*/

            for (int k = 1; k < arr.length; k++) {
                dp[i][k] += dp[i][k - 1];
            }
            /*ints = [2, 9, 49, 68]
            ints = [0, 7, 47, 66]
            ints = [0, 0, 40, 59]
            ints = [0, 0, 0, 19]*/
        }
        for (int[] ints : dp) {
            System.out.println("ints = " + Arrays.toString(ints));
        }

    }

    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        sumUntil(coins);
    }
}
