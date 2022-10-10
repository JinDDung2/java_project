package codeup;

import java.util.Scanner;

public class Code1035 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int hexaNum = Integer.valueOf(str, 16);
        String octalNum = Integer.toOctalString(hexaNum);
        sc.close();

        System.out.println(octalNum);

    }
}

