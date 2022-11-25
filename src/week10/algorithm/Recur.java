package week10.algorithm;

public class Recur {
    public static void recur(int n) {
        if (n <= 0) return;
        recur(n - 1);
        System.out.println(n);
        recur(n - 2);
    }

    public static void recurV2(int n) {
        // if (n <= 0) return;
        // if --> while 바꾸기
        while (n > 0) {
            recur(n - 1);
            System.out.println(n);
            // recur(n - 2);
            // n의 값을 낮추는 로직을 변경
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        recur(4);
    }
}
