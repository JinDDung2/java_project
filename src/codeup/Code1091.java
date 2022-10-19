package codeup;


import java.util.Scanner;

public class Code1091 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long result = a;

        for (int i = 1; i < d; i++) {
            result = result * b + c;
        }
        System.out.println(result);
    }
}

