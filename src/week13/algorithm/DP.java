package week13.algorithm;

import java.util.Arrays;

class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
}

public class DP {
    public static void optimalStrategy(int[] arr) {
        Pair[][] dp = new Pair[arr.length][arr.length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                Pair temp = new Pair(arr[j], 0);
                if (i==j) dp[i][j] = temp;
            }
        }

        for (Pair[] pairs : dp) {
            System.out.println("pairs = " + Arrays.toString(pairs));
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 40, 19};
        optimalStrategy(arr);

    }
}
