package week11.algorithm;

public class divisor {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result1 = solution(12);
        int result2 = solution(5);
        System.out.printf("result1=%d, result2=%d", result1, result2);
    }
}
