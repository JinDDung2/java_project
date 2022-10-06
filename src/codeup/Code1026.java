package codeup;

import java.util.Scanner;

public class Code1026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strList = str.split(":");
        int num = Integer.parseInt(strList[1]);

        System.out.println(num);


    }
}

