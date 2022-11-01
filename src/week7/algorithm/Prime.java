package week7.algorithm;

public class Prime {
    // 소수인 경우의 수 찾기
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            if (isPrimeV3(i)) {
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

    // 소수인지 판별하기 3번
    public boolean isPrimeV3(int n) {
        if (n == 0 || n == 1) return false;

        for (int i = 2; i < n*0.5+1; i++) {
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
        boolean primeV2 = prime.isPrimeV2(13);
        System.out.println("primeV2 = " + primeV2);
        boolean primeV3 = prime.isPrimeV3(8);
        System.out.println("primeV3 = " + primeV3);
    }
}
