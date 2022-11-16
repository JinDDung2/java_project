package wwek9.algorithm;

import java.util.Arrays;

public class QuickSortV2 {
    public static int[] sort(int[] arr) {

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        int pivot = arr[arr.length / 2];
        System.out.println("pivot = " + pivot);

        while (leftIdx <= rightIdx) {
            // left 증가
            if (arr[leftIdx] < pivot) leftIdx++;
            // right 감소
            if (arr[rightIdx] > pivot) rightIdx--;
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
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
