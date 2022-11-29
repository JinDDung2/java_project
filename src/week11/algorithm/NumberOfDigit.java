package week11.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 1111111111};
        int[] rst = getDigits(arr);
        System.out.println("rst = " + Arrays.toString(rst));
    }
}
