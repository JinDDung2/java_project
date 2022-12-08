package week12.algorithm;

public class Fibo {
    public static int fibo(int n, int[] memo) {
        for (int i = 0; i < memo.length; i++) {
            if (i <= 1) memo[i] = 1;
            else memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 7;
        int[] memo = new int[n + 1];
        int result = fibo(n, memo);
        System.out.println("result = " + result);
    }

}
