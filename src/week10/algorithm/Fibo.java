package week10.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibo {
    public int fibo(int num) {
        if (num >= 2) return fibo(num - 1) + fibo(num - 2);
        else return num;
    }

    public int fib(int n) {
        if (n == 1 || n == 2) return 1;
        List<Integer> fibNums = new ArrayList<>();
        fibNums.add(1);
        fibNums.add(1);
        for (int i = 2; i < n; i++) {
            fibNums.add(fibNums.get(i - 1) + fibNums.get(i - 2));
        }
//        System.out.println("fibNums = " + fibNums);
        return fibNums.get(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Fibo sol = new Fibo();
        int answer1 = sol.fibo(num);
        System.out.println("answer1 = " + answer1);
        int answer2 = sol.fib(num);
        System.out.println("answer2 = " + answer2);
    }
}
