package week13.algorithm;

public class LeftAndRight {
    public static void leftRight(int[] arr) {
        Pair[][] dp = new Pair[arr.length][arr.length];

        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                int coinLeft = arr[j];
                int coinRight = arr[j+i];
                dp[i][j] = new Pair(coinLeft, coinRight);
                System.out.printf("%d %d\n", coinLeft, coinRight);
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        leftRight(coins);
    }
}
