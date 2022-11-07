package week8.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(solution(new int[]{3, 2, 6}, 10));
    }
}
