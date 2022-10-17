package codeup;


import java.util.Scanner;

public class Code1087 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 1;
        int sum = 0;
        while (sum < a) {
            if (sum >= a) break;
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}

