package week12.algorithm;

import java.util.PriorityQueue;

public class DiskController {
    public static int solution(int[][] jobs) {
        int answer = 0;
        int now = 0;
        int idx = 0;
        int start = -1;

        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);


        while (idx < jobs.length) {
            for (int[] job : jobs) {
                if (start < job[0] && job[0] <= now) {
                    q.add(new int[]{job[0], job[1]});
                }
            }
            /*for (int[] ints : q) {
                System.out.println("q = " + q);
                System.out.println("ints = " + Arrays.toString(ints));
            }*/

            if (!q.isEmpty()) {
                int[] work = q.poll();
                start = now;
                now += work[1];
                answer += (now - work[0]);
                idx++;
            }
            else now++;
        }

        return Math.floorDiv(answer, jobs.length);
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        int result = solution(jobs);
        System.out.println("result = " + result);
    }
}
