package week8.algorithm;

public class HarshadNum {
    public static boolean solution(int x) {
        boolean answer = true;
        int a = x;
        int b = 0;


        for (int i = 0; i < 5; i++) {
            b += a % 10;
            a /= 10;
        }

        if (x % b != 0) answer = false;

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
}
