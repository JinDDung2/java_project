package week11.algorithm;

import java.util.*;

public class HalfOfFame {
    // score 길이만큼 answer을 만들고, k는 최대힙을 활용하여 최근에 들어온 점수랑 k의 최소값이랑 비교한다
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) que.add(score[i]);
            else {
                if (score[i] > que.peek()) {
                    que.poll();
                    que.add(score[i]);
                }
            }
            answer[i] = que.peek();
        }

        /*System.out.println("que = " + que);
        System.out.println("answer = " + Arrays.toString(answer));*/

        return answer;
    }

    public static void main(String[] args) {
        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }
}
