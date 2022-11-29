package week11.algorithm;

import java.util.Arrays;

public class Radix {
    public static void sort(int[] arr) {
        int[] sortArr = new int[10000];
        Arrays.fill(sortArr, -1);
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i];
            sortArr[idx] = idx;
        }
        /*System.out.println("sortArr = " + Arrays.toString(sortArr));

        for (int i : sortArr) {
            if (i != -1) System.out.println(i);
        }*/

        int index = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (sortArr[i] != -1) {
                arr[index++] = sortArr[i];
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        sort(arr);
        int[] arr2 = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14};
        sort(arr2);
    }
}
