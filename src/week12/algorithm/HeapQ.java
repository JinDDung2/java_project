package week12.algorithm;

import java.util.Arrays;

public class HeapQ {
    public static int[] heapV1(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            if (i % 2 != 0 && arr[i] > arr[i / 2]) swap(arr, i, i / 2);
            else if (i % 2 == 0 && arr[i] > arr[i / 2 - 1]) swap(arr, i, i / 2 - 1);
            System.out.println("i = " + i);
            System.out.println("arr = " + Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] heapV2(int[] arr, int parentIdx) {
//        if (2*parentIdx+1 > arr.length-1) return arr;
//        System.out.println("parentIdx = " + parentIdx);

        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        if (leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        if (rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }
        swap(arr, parentIdx, greaterIdx);
//        System.out.println("arr = " + Arrays.toString(arr));
//        heapV2(arr, parentIdx+1);
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        int[] result = heapV2(arr, 0);
        System.out.println("result = " + Arrays.toString(result));
    }
}
