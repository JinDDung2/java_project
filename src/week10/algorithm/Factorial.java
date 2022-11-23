package week10.algorithm;

import java.util.Scanner;

public class Factorial {
    public int factorial(int num, int n) {
        if (num == 1) return n;
        n *= num;
        return factorial(num-1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial sol = new Factorial();
        int answer = sol.factorial(num, 1);
        System.out.println("answer = " + answer);
    }
}
