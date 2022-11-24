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

    public static void main(String[] args) {
        CodeUp codeUp = new CodeUp();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        codeUp.codeUp1852(n, 1);
        System.out.println(codeUp.codeUp1856(n));
    }
}
