package week12.algorithm;

import java.util.Scanner;

public class Dialect {
    public static int dialect(String str1, String str2) {
        int[][] memo = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i < str2.length()+1; i++) {
            for (int j = 1; j < str1.length()+1; j++) {
                if (str2.charAt(i-1) == str1.charAt(j-1)) memo[i][j] = memo[i-1][j-1] + 1;
                else memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
            }
        }
        /*for (int[] ints : memo) {
            System.out.println("ints = " + Arrays.toString(ints));
        }*/
        return memo[str2.length()][str1.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(dialect(str1, str2));
    }
}
