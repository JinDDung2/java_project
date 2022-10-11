package week4.algorithm;

import java.util.Scanner;

public class SumOfDigit {
    public int solutionA(String strNum) {
        int result = 0;
        for (int i = 0; i < strNum.length(); i++) {
            result += Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }
        return result;
    }

    // 몫과 나머지 연산자를 활용해보기
    public int solutionB(int num) {
        int result = 0;

        // for문이 아니라 while 사용
        while (num > 0) {

            // 나머지를 먼저 구해야한다
            result += num % 10;
            num /= 10;
            System.out.printf("result: %d, num: %d \n", result, num);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfDigit sod = new SumOfDigit();

//        String strNum = sc.nextLine();
        /*int resultA = sod.solutionA(strNum);
        System.out.println(resultA);*/

        int num = sc.nextInt();
        int resultB = sod.solutionB(num);
        System.out.println(resultB);

    }
}
