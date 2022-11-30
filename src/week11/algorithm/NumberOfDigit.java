package week11.algorithm;

import java.util.*;

public class NumberOfDigit {
    public static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) set.add(1);
            else {
                int digit = (int) (Math.log10(arr[i]) + 1);
                set.add(digit);
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;

        for (int num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static int[] sort(int[] arr, int digit) {
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int divisor = (int) (Math.pow(10, digit-1));
            queueArr[Math.floorDiv(arr[i], divisor) % 10].add(arr[i]);
        }

        // queue에서 꺼내서 arr로 만들기
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) { // queueArr을 반복 합니다.
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 1111111111};
        int[] digits = getDigits(arr);
        for (int digit : digits) {
            sort(arr, digit);
        }
    }
}
