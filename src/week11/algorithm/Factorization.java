package week11.algorithm;

import java.util.Scanner;

public class Factorization {
    public static void intoPrime(int n) {
        int idx = 2;

        while (idx <= n) {
            if (n % idx == 0) {
                n /= idx;
                System.out.printf("%d ", idx);
            }
            else idx += 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        intoPrime(n);
    }
}
