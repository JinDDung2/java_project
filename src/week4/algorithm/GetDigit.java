package week4.algorithm;

import java.util.Scanner;

// 코드업 자릿수 계산
public class GetDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int cnt = 0;
        while (num > 0) {
            num /= 10;
            cnt += 1;
        }

        System.out.println(cnt);
    }
}
