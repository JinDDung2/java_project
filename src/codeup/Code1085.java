package codeup;


import java.util.Scanner;

public class Code1085 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strList = sc.nextLine().split(" ");
        double h = Integer.parseInt(strList[0]);
        double b = Integer.parseInt(strList[1]);
        double c = Integer.parseInt(strList[2]);
        double s = Integer.parseInt(strList[3]);

        double result = (h * b * c * s) / (8 * 1024 * 1024);
        System.out.printf("%.1f MB", result);
    }
}

