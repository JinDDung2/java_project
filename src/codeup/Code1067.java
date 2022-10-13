package codeup;

import java.util.Scanner;

public class Code1067 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("plus");
        } else if (num < 0) {
            System.out.println("minus");
        }
        if (num % 2 == 0) {
            System.out.println("even");
        } else  {
            System.out.println("odd");
        }

    }
}
