package week8.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class DividedNumArray {
    public static ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }

        Collections.sort(answer);

        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer;
    }

    // [1, 3, 2, 36] 정렬이 안되어있다..
    public static int[] solutionV2(int[] arr, int divisor) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                pq.offer(num);
            }
        }

        if (pq.isEmpty()) return new int[]{-1};

        int[] answer = new int[pq.size()];
        int idx = 0;
        while (!pq.isEmpty()) {
            answer[idx++] = pq.poll();
        }

//        System.out.println("answer = " + Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(solution(new int[]{3, 2, 6}, 10));
        System.out.println("----------------------------");
        System.out.println(solutionV2(new int[]{5, 9, 7, 10}, 5));
        System.out.println(solutionV2(new int[]{2, 36, 1, 3}, 1));
        System.out.println(solutionV2(new int[]{3, 2, 6}, 10));
    }
}
