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

    public static int[] heapV2(int[] arr, int parentIdx, int arrSize) {
//        if (2*parentIdx+1 > arr.length-1) return arr;
//        System.out.println("parentIdx = " + parentIdx);

        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        if (leftIdx < arrSize && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        if (rightIdx < arrSize && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        // 교환이 일어난 경우
        if (greaterIdx != parentIdx) {
            swap(arr, parentIdx, greaterIdx);
            heapV2(arr, greaterIdx, arrSize);
        }
//        System.out.println("arr = " + Arrays.toString(arr));
//        heapV2(arr, parentIdx+1);
        return arr;
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7};
        int[] arr2 = new int[]{10, 9, 5, 8, 3, 2, 4, 6, 7, 1};
        for (int i = (arr2.length-2)/2; i >=0 ; i--) {
            arr = heapV2(arr2, i, arr2.length);
//            System.out.println("arr = " + Arrays.toString(arr));
        }
        // 정렬
        for (int i = arr.length-1; i > 0; i--) {
            swap(arr2, 0, i);
            arr2 = heapV2(arr2, 0, i);
            System.out.println("arr = " + Arrays.toString(arr));
        }

    }
}
