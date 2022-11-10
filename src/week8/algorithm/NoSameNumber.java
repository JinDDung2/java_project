package week8.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NoSameNumber {
    // arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return
    public int[] solutionV1(int []arr) {
        List<Integer> numList = new ArrayList<>();

        numList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                numList.add(arr[i]);
            }
        }

//        System.out.println("numList = " + numList);
        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }


    public int[] solutionV2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }
//        System.out.println("stack = " + stack);

        int[] answer = new int[stack.size()];
        for (int i = stack.size()-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};
        NoSameNumber noSameNumber = new NoSameNumber();
        int[] sol1 = noSameNumber.solutionV1(arr1);
        System.out.println("sol1 = " + Arrays.toString(sol1));
        int[] sol2 = noSameNumber.solutionV2(arr1);
        System.out.println("sol2 = " + Arrays.toString(sol2));
    }
}
