package codeup;

import java.util.Scanner;

public class Code1080 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int last = sc.nextInt();
        int num = 0;
        int sum = 0;

        while (sum < last) {
            num++;
            sum += num;
        }

        System.out.println(num);

    }
}



