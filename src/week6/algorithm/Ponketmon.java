package week6.algorithm;

import java.util.HashMap;
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

    public int solutionV2(int[] nums) {
        // 최대로 잡을 수 있는 개수
        int maxCnt = nums.length / 2;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        return Math.min(maxCnt, hm.size());
    }
}
