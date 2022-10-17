package codeup;


import java.util.Scanner;

public class Code1088 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num+1; i++) {
            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}

