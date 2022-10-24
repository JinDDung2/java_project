package week6.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNum {
    public String solution(int[] numbers) {
        String answer = "";
        String[] stringList = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringList[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(stringList, (first, next) -> {
            return (first + next).compareTo(next + first);
        });

        for (int i = numbers.length-1; i >= 0; i--) {
            answer += stringList[i];
        }

        if (answer.charAt(0) == '0') {
            answer = "0";
        }
        return answer;
    }

}
