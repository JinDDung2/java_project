package week12.algorithm;

import java.util.Arrays;

public class HeapQ {
    public static int[] heapV1() {
        int[] arr = new int[]{6, 5, 7, 8};
        for (int i = arr.length - 1; i >= 1; i--) {
            if (i % 2 != 0 && arr[i] > arr[i/2]) swap(arr, i, i/2);
            else if (i % 2 == 0 && arr[i] > arr[i/2-1])swap(arr, i, i/2-1);
            System.out.println("i = " + i);
            System.out.println("arr = " + Arrays.toString(arr));
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = heapV1();
        System.out.println("lastArr = " + Arrays.toString(arr));
    }
}
