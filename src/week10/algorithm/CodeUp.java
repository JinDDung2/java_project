package week10.algorithm;

import java.util.Scanner;

public class CodeUp {
    public void codeUp1852(int n, int idx) {
        if (idx > n) return;
        System.out.printf("%d ", idx);
        codeUp1852(n, idx+1);
    }

    public static void main(String[] args) {
        CodeUp codeUp = new CodeUp();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        codeUp.codeUp1852(n, 1);
    }
}
