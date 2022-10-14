package week4.algorithm;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr) {

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
