package week10.algorithm;

import java.util.Scanner;

public class CodeUp {
    public void codeUp1852(int n, int idx) {
        if (idx > n) return;
        System.out.printf("%d ", idx);
        codeUp1852(n, idx+1);
    }

    public int codeUp1856(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1 + codeUp1856(1);
        else if (n == 3) return 1 + codeUp1856(1) + codeUp1856(2);
        else return codeUp1856(n - 3) + codeUp1856(n - 2) + codeUp1856(n - 1);
    }

    public void codeUp1859(int n) {
        if (n <= 0) return;
        System.out.print("*");
        codeUp1859(n-1);
    }

    public void printV1(int now, int n) {
        if (now > n) return;
        codeUp1859(now);
        System.out.println();
        printV1(now+1, n);
    }

    public String codeUp1860(int n) {
        if (n <= 0) return "";
        return codeUp1860(n - 1) + n + " ";
    }

    public void printV2(int n) {
        if (n <= 0) return;
        printV2(n-1);
        System.out.println(codeUp1860(n));
    }

    public static void main(String[] args) {
        CodeUp codeUp = new CodeUp();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        codeUp.codeUp1852(n, 1);
//        System.out.println(codeUp.codeUp1856(n));
//        codeUp.printV1(1, n);
        codeUp.printV2(n);
    }
}
