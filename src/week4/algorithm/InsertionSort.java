package week4.algorithm;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr) {
        if (arr[1] < arr[0]) {
            int temp = 0;
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        // 첫번째 인덱스엥서 출발
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort sortArr = new InsertionSort();
        int[] result = sortArr.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
