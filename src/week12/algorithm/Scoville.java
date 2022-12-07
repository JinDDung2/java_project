package week12.algorithm;

import java.util.PriorityQueue;

public class Scoville {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int num : scoville) {
            q.add(num);
        }

//        System.out.println("q = " + q);

        while (q.peek() < K) {
            // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
            if (q.size() == 1) return -1;

            int a = q.poll();
            int b = q.poll();
            int hot = a + 2*b;
            q.add(hot);
            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println("result = " + result);
    }

}
