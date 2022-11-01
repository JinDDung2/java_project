package week7.algorithm;

public class Prime {

    PrimeTemplate template;
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

    // 템플릿 콜백 적용한 메서드
    public boolean isPrimeV4(int n, PrimeTemplate template) {
        if (n == 0 || n == 1) return false;

        for (int i = 2; template.getMax(n, i); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /*public boolean callbackV1(int n) {
        return isPrimeV4(n, new PrimeTemplate() {
            @Override
            public boolean getMax(int n, int i) {
                return i <= n;
            }
        });
    }

    public boolean callbackV2(int n) {
        return isPrimeV4(n,new PrimeTemplate() {
            @Override
            public boolean getMax(int n, int i) {
                return i/2 <= n;
            }
        });
    }

    public boolean callbackV3(int n) {
        return isPrimeV4(n, new PrimeTemplate() {
            @Override
            public boolean getMax(int n, int i) {
                return i*0.5+1 <= n;
            }
        });
    }*/

    // 템플릿 콜백 느낌
    public boolean plain (int n, int i) {
        return i <= n;
    }

    public boolean half (int n, int i) {
        return i/2 <= n;
    }

    public boolean sqrt (int n, int i) {
        return i*0.5+1 <= n;
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

        boolean primeV4 = prime.isPrimeV4(13, new PrimeTemplate() {
            @Override
            public boolean getMax(int n, int i) {
                return n * 0.5 + 1 < i;
            }
        });
        System.out.println("primeV4 = " + primeV4);
        System.out.println(prime.isPrimeV4(13, (a, b) -> a<b));
        System.out.println(prime.isPrimeV4(17, (a, b) -> a<b/2));
        System.out.println(prime.isPrimeV4(19, (a, b) -> a<b*0.5+1));

    }
}
