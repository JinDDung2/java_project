package week5.algorithm;

import java.util.*;

class CorrectBracket {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            }

            if (ch == ')') {
                if (stack.size() == 0) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }

        answer = stack.size() == 0 ? true : false;

        return answer;
    }

    boolean solution2(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ( num < 0 ) break;
            if (ch == '(') {
                num += 1;
            } else if (ch == ')') {
                num -= 1;
            }
        }


        return num == 0? true : false;
    }
}