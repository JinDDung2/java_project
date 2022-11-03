package week7.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

// 수업 실습용
public class EratosthenesV3 {
    public static int getPrimeCount(int num) {
        int count = 0;
        int[] nums = new int[num-1];
        boolean[] memo = new boolean[nums.length];
        Arrays.fill(memo, true);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        getPrimeCount(50);
    }
}
