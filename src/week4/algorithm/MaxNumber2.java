package week4.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber2 {
    // 코드업 4596 : 최대값 2
    /**
     * @return : [max, i, j]
     */
    public int[] getMaxAndIdx(int[][] arr) {

        int[] result = {arr[0][0], 0, 0};
        int max = arr[0][0];
        int[] idx = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // max 값보다 더 큰 값이 존재하면 큰 값을 max 값으로 바꿈
                // 바꾸었을 때의 인덱스를 idx에 저장
                if (result[0] < arr[i][j]) {
                    result[0] = arr[i][j];
                    result[1] = i;
                    result[2] = j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        /*int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}};*/

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        MaxNumber2 solution = new MaxNumber2();
        int[] result = solution.getMaxAndIdx(arr);
        System.out.println(result[0]);
        System.out.printf("%d %d", result[1]+1, result[2]+1);



    }
}


