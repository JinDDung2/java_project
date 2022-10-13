package week4.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public int[] arrSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int temp = 0;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrSort = bubbleSort.arrSort(arr);

        System.out.println(Arrays.toString(arrSort));
    }
}
