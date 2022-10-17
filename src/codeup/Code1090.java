package codeup;


import java.util.Scanner;

public class Code1090 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long result = 0;
        result = (long) (a * Math.pow(b, c - 1));
        System.out.println(result);
    }
}

