package week9.algorithm;

public class CaesarsCode {
    public static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                answer += " ";
            } else {
                int num = s.charAt(i) + n;
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                    if (num > 90) {
                        answer += (char) (num - 26);
                    } else {
                        answer += (char) num;
                    }
                } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    if (num > 122) {
                        answer += (char) (num - 26);
                    } else {
                        answer += (char) num;
                    }
                }
            }

        }
//        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("z", 1);
        solution("a B z", 4);

    }
}
