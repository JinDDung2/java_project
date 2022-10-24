package week6.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NumberOfKth {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;

        for (int[] command : commands) {
            int[] arr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(arr);
            answer[idx++] = arr[command[2] - 1];
        }

        return answer;
    }

    public int numberOfKth(int[] array, int[] command) {
        int start = command[0]-1;
        int last = command[1];
        int kth = command[2];
        int rst = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = start; i < last; i++) {
            pq.add(array[i]);
        }

        for (int i = 0; i < kth; i++) {
            rst = pq.poll();
        }
        return rst;
    }

    public int[] solutionV2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = numberOfKth(array, commands[i]);
        }
        return answer;
    }
}
