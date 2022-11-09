package week8.algorithm;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int min = arr[0];
        // i=0일때 제일 작은 값의 인덱스찾기
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
                System.out.println("i = " + i);
            }
        }
    }
}
