package week6.algorithm;

import java.util.HashSet;
import java.util.Set;

public class Ponketmon {
    public int solution(int[] nums) {
        int maxCnt = nums.length/2;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int answer = Math.min(maxCnt, set.size());

        return answer;
    }
}
