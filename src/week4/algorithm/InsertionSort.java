package week4.algorithm;

import java.util.Arrays;

public class InsertionSort {

    public int[] sortV1(int[] arr, int i) {
        for (int j=i; j>0; j--) {
//            System.out.printf("i:%d, j:%d, j-1:%d\n", i, j, j-1);
            if (arr[j] < arr[j-1]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }

    public int[] sortV2(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>0; j--) {
    //            System.out.printf("i:%d, j:%d, j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;
    }

    public int[] sortV3(int[] arr, int i) {
        if (i == arr.length) return arr;

        for (int j=i-1; j>=0; j--) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        return sortV3(arr, i+1);
    }

    public static void main(String[] args) {
        // 첫번째 인덱스엥서 출발
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort sortArr = new InsertionSort();
//        int[] result = sortArr.sortV1(arr, 2);
//        int[] result = sortArr.sortV2(arr);
        int[] result = sortArr.sortV3(arr, 1);
        System.out.println(Arrays.toString(result));

    }
}
