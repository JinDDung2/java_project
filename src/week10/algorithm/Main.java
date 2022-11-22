package week10.algorithm;

import java.util.Scanner;

public class Main {

    public static void printStar(int n, int idx) {
        if (idx == n) return;
        System.out.print("*");
        idx++;
        printStar(n, idx);
    }

    public static void printSum(int n, int idx, int sum) {
        if (idx > n) {
            System.out.println(sum);
            return;}
        sum += idx;
        /*System.out.println("idx = " + idx);
        System.out.println("sum = " + sum);*/
        idx++;
        printSum(n, idx, sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        printStar(n, 0);
        printSum(n, 1, 0);

    }
}
