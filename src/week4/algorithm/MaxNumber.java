package week4.algorithm;

import java.util.Scanner;

public class MaxNumber {
    // 크드업 2081 : 최대값 I
    // {3, 29, 38, 12, 57, 74, 40, 85, 61 };

    /**
     * @return : max, maxIdx
     */
    public int[] getMaxIdx(int[] arr) {
        // max값을 0으로 초기화할 경우 배열 안의 수가 모두 음수이면 0이 최댓값이 되어버려서 원하는 값이 나오지 않음
        int[] result = {arr[0], 0}; // max, maxIdx
        for (int i=1; i<arr.length; i++) {
            // max 값보다 더 큰 값이 존재하면 큰 값을 max 값으로 바꿈
            // 바꾸었을 때의 인덱스를 idx에 저장
            if(result[0] < arr[i]) {
                result[0] = arr[i];
                result[1] = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        MaxNumber solution = new MaxNumber();
        int[] result = solution.getMaxIdx(arr);
        System.out.println(result[0]);
        System.out.println(result[1]+1);
    }
}
