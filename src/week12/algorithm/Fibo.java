package week12.algorithm;

public class Fibo {
    public static int fibo(int n, int[] memo) {
        if (n <= 0) return -1;
        for (int i = 1; i < memo.length; i++) {
            if (i <= 2) memo[i] = 1;
            else memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    public static int fiboV0(int n) {
        if (n <= 0) return -1;
        if (n == 1 || n == 2) return 1;
        else return fiboV0(n - 1) + fiboV0(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;
        int[] memo = new int[n + 1];
        int result = fibo(n, memo);
        System.out.println("result = " + result);
        int result2 = fiboV0(8);
        System.out.println("result2 = " + result2);
    }

}
