package codeup;


import java.util.Scanner;

public class Code1092 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;

        while (true) {
            ++cnt;
            if (cnt % a == 0 && cnt % b == 0 && cnt % c == 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}

