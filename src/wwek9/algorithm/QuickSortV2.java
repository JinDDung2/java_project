package wwek9.algorithm;

import java.util.Arrays;

public class QuickSortV2 {
    public static void sort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return;

        int pivot = divideTwoGroup(arr, startIdx, endIdx);
        sort(arr, startIdx, pivot - 1);
        sort(arr, pivot, endIdx);
    }

    public static int divideTwoGroup(int[] arr, int leftIdx, int rightIdx) {
        int pivot = arr[(leftIdx + rightIdx) / 2];

        while (leftIdx <= rightIdx) {
            // left 증가
            while (arr[leftIdx] < pivot) leftIdx++;
            // right 감소
            while (arr[rightIdx] > pivot) rightIdx--;

            if (leftIdx <= rightIdx) {
                swap(arr, leftIdx, rightIdx);
                leftIdx++;
                rightIdx--;
            }
        }
        return leftIdx;
    }

    private static void swap(int[] arr, int leftIdx, int rightIdx) {
        int temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        /*int pivot = arr[arr.length / 2];
        System.out.println("pivot = " + pivot);

        while (leftIdx <= rightIdx) {
            // left 증가
            while (arr[leftIdx] < pivot) leftIdx++;
            // right 감소
            while (arr[rightIdx] > pivot) rightIdx--;
            System.out.println("leftIdx = " + leftIdx);
            System.out.println("rightIdx = " + rightIdx);
            if (leftIdx <= rightIdx) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx++;
                rightIdx--;
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));*/
        sort(arr, 0, arr.length - 1);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
