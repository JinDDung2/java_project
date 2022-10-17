package codeup;


import java.util.Scanner;

public class Code1086 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strList = sc.nextLine().split(" ");
        double w = Integer.parseInt(strList[0]);
        double h = Integer.parseInt(strList[1]);
        double b = Integer.parseInt(strList[2]);


        double result = (w * h * b) / (8 * 1024 * 1024);
        System.out.printf("%.2f MB", result);
    }
}

