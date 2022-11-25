package week10.algorithm;

import java.util.Scanner;

public class Gcd {
    public int gcd(int a, int b) {
//        System.out.println("a = " + a + " b = " + b);
        if (a == b) return a;
        else if (a > b) return gcd(a - b, b);
        else if (b > a) return gcd(a, b-a);
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        Gcd sol = new Gcd();
        int gcd = sol.gcd(first, second);
        System.out.println("gcd = " + gcd);
    }
}
