package week7.algorithm;

import week4.Main;

import java.util.ArrayList;
import java.util.Arrays;

public class MockTest {
    public ArrayList<Integer> solution(int[] answers) {
        int[] scores = new int[3];
        int[] firstArr = {1, 2, 3, 4, 5};
        int[] secondArr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdArr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 정답일치하는지
        for (int i = 0; i < answers.length; i++) {
            if (firstArr[i % firstArr.length] == answers[i]) {
                scores[0] += 1;
            }
            if (secondArr[i % secondArr.length] == answers[i]) {
                scores[1] += 1;
            }
            if (thirdArr[i % thirdArr.length] == answers[i]) {
                scores[2] += 1;
            }
        }

        // 최대값
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 0;
        for (int score : scores) {
            if (max < score) {
                max = score;
            }
        }
        // System.out.println("max = " + max);

        // 배열크기
        for (int i = 0; i < 3; i++) {
            if (scores[i] == max) {
                list.add(i+1);
            }
        }

        // System.out.println(Arrays.toString(scores));
        // System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        MockTest mockTest = new MockTest();
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};

        mockTest.solution(answers2);
    }
}
