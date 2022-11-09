package week8.algorithm;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SelectSort {

    public static int[] sort(int[]arr, Strategy strategy) {
        for (int i = 0; i < arr.length-1; i++) {
            // 비교기준이 되는 값을 최소값으로 설정
            int minIdx = i;
            // 스왑을 위한 temp
            int temp = arr[i];
            // 비교 대상은 인덱스 i값의 다음값을 비교할 것임
            for (int j = i+1; j < arr.length; j++) {
                // 반복을 통해 min을 최솟값으로 계속 재할당함
                if (strategy.sortType(arr[minIdx], arr[j])) {
                    minIdx = j;
                }
            }
            // 최솟값을 가진 인덱스랑 비교 기준의 인덱스랑 스왑
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            // 스왑이 잘 되고있나 디버깅
//            System.out.println("i=" + i + " / " + Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] sortV2(int[]arr, BiFunction<Integer, Integer, Boolean> strategy) {
        for (int i = 0; i < arr.length-1; i++) {
            // 비교기준이 되는 값을 최소값으로 설정
            int minIdx = i;
            // 스왑을 위한 temp
            int temp = arr[i];
            // 비교 대상은 인덱스 i값의 다음값을 비교할 것임
            for (int j = i+1; j < arr.length; j++) {
                // 반복을 통해 min을 최솟값으로 계속 재할당함
                if (strategy.apply(arr[minIdx], arr[j])) {
                    minIdx = j;
                }
            }
            // 최솟값을 가진 인덱스랑 비교 기준의 인덱스랑 스왑
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            // 스왑이 잘 되고있나 디버깅
//            System.out.println("i=" + i + " / " + Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int[] sortInc = sort(arr, (a, b) -> a > b);
        int[] sortDec = sort(arr, (a, b) -> a < b);
        System.out.println("sortInc = " + Arrays.toString(sortInc));
        System.out.println("sortDec = " + Arrays.toString(sortDec));

        /*Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10, 30}));*/

        int[] arr2 = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
        int[] sortIncV2 = sortV2(arr2, biFunction);
        System.out.println("sortIncV2 = " + Arrays.toString(sortIncV2));
    }
}
