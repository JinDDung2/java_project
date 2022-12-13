package week13.algorithm;

import java.util.Arrays;

class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

public class DP {
    public static void optimalStrategy(int[] arr) {
        Pair[][] dp = new Pair[arr.length][arr.length];

        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = new Pair(arr[i], 0);
            for (int j = 1; j < dp[0].length; j++) {
                if (i == j-1) dp[i][j] = new Pair(Math.max(arr[i], arr[j]), Math.min((arr[i]), arr[j]));
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
