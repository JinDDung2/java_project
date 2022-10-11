package week4.algorithm;

import java.util.Scanner;

public class SumOfDigit {
    public int solution(String strNum) {
        int result = 0;
        for (int i = 0; i < strNum.length(); i++) {
            result += Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNum = sc.nextLine();

        SumOfDigit solution = new SumOfDigit();
        int result = solution.solution(strNum);
        System.out.println(result);


    }
}
