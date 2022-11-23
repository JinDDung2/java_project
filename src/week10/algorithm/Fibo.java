package week10.algorithm;

import java.util.Scanner;

public class Fibo {
    public int fibo(int num) {
        if (num >= 2) return fibo(num - 1) + fibo(num - 2);
        else return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Fibo sol = new Fibo();
        int answer = sol.fibo(num);
        System.out.println("answer = " + answer);
    }
}
