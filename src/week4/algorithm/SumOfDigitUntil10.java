package week4.algorithm;

import java.util.Scanner;

public class SumOfDigitUntil10 {

    // 몫과 나머지 연산자를 활용해보기
    public int sumOfDigit(int num) {
        int result = 0;

        // for문이 아니라 while 사용
        while (num > 0) {

            // 나머지를 먼저 구해야한다
            result += num % 10;
            num /= 10;
//            System.out.printf("result: %d, num: %d \n", result, num);
        }

        return result;
    }

    public int untilTen(int num) {
        int result = num;
        int cnt = 0;

        while (result >= 10) {
            result = sumOfDigit(result);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfDigitUntil10 sod = new SumOfDigitUntil10();

        int num = sc.nextInt();
        int firstNum = sod.sumOfDigit(num);
        int finalNum = sod.untilTen(firstNum);
        System.out.println(finalNum);

    }
}
