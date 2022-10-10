package codeup;

import java.util.Scanner;

public class Code1034 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = Integer.valueOf(str, 8);
        sc.close();

        System.out.println(num);

    }
}

