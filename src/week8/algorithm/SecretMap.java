package week8.algorithm;

import java.util.Arrays;

public class SecretMap {
    // 1. n개의 배열을 만든다.
    // 2. arr1, arr2의 값을 이진수(binary)로 바꾼 새로운 배열 2개를 만든다.
    // 3. for 문을 돌아 이진수로 바뀐 값이 담겨져 있는 배열 2개 중 1을 "#"으로, 0은 " "으로 채운다.
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] numArr1 = new String[n];
        String[] numArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            numArr1[i] = Integer.toBinaryString(arr1[i]);
            numArr2[i] = Integer.toBinaryString(arr2[i]);
        }

        /*System.out.println("numArr2 = " + Arrays.toString(numArr2));
        System.out.println("numArr1 = " + Arrays.toString(numArr1));
        numArr2 = [11110, 1, 10101, 10001, 11100]
        numArr1 = [1001, 10100, 11100, 10010, 1011]*/


        return answer;
    }

    public String binaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (num>0) {
            sb.append(num % 2);
            num /= 2;
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        SecretMap map = new SecretMap();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] solution = map.solution(5, arr1, arr2);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
