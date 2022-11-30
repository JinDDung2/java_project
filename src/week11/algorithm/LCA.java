package week11.algorithm;

import java.util.Scanner;

public class LCA {
    public static void distanceOfNode(int a, int b, int count) {
//        System.out.printf("a=%d, b=%d, count=%d\n", a, b, count);
        if (a == b) System.out.println(count);
        else if (a > b) distanceOfNode(Math.floorDiv(a, 2), b, count + 1);
        else if (b > a) distanceOfNode(a, Math.floorDiv(b, 2), count + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        distanceOfNode(num1, num2, 0);
    }
}
