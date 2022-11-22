package wwek9.algorithm;

import java.util.Scanner;

public class Main {
    public static void quickSort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return;

        int pivot = divideTwoGroup(arr, startIdx, endIdx);
        quickSort(arr, startIdx, pivot - 1);
        quickSort(arr, pivot, endIdx);
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("arr = " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
    }
}
