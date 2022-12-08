package week11.algorithm;

import java.util.Scanner;

public class Factorization {
    public static int intoPrime(Long n) {
        int idx = 2;
        int max = 0;

        while (idx <= n) {
            if (n % idx == 0) {
                n /= idx;
                max = idx;
            }
            else idx += 1;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        long n = sc.nextLong();
        System.out.println(intoPrime(n));
    }
}
