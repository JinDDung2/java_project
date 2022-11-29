package week11.algorithm;

import java.util.Arrays;

public class Radix {
    public static void sort(int[] arr) {
        int[] sortArr = new int[10];
        Arrays.fill(sortArr, -1);
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i];
            sortArr[idx] = idx;
        }
        System.out.println("sortArr = " + Arrays.toString(sortArr));

        for (int i : sortArr) {
            if (i != -1) System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        sort(arr);
    }
}
