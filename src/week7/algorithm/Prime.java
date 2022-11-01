package week7.algorithm;

public class Prime {
    // 소수인 경우의 수 찾기
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            if (isPrimeV1(n) == true) {
                answer += 1;
            }
        }

        return answer;
    }

    // 소수인지 판별하기 1번
    public boolean isPrimeV1(int n) {
        if (n == 0 || n == 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    // 소수인지 판별하기 2번
    public boolean isPrimeV2(int n) {
        if (n == 0 || n == 1) return false;

        for (int i = 2; i < n/2+1; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }



    public static void main(String[] args) {
        Prime prime = new Prime();
        int result = prime.solution(10);
        System.out.println("result = " + result);
        boolean primeV1 = prime.isPrimeV1(5);
        System.out.println("primeV1 = " + primeV1);
    }
}
