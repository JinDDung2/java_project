package codeup;

import java.util.Scanner;

public class Code1039 {

    public static Long plus(Long first, Long second) {
        return first + second;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();

        Long reuslt = plus(num1, num2);
        System.out.println(reuslt);

    }
}

