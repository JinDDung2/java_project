package week12.algorithm;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        // str2이 세로, str1이 가로
        String[][] strList = new String[str2.length()][str1.length()];
        int[][] memo = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i < str2.length()+1; i++) {
            for (int j = 1; j < str1.length()+1; j++) {
//                System.out.printf("i: %s | j: %s \n", str2.charAt(i), str1.charAt(j));
                if (str2.charAt(i-1) == str1.charAt(j-1)) memo[i][j] = memo[i - 1][j - 1] + 1;
                else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }

        for (int[] ints : memo) {
            System.out.println("ints = " + Arrays.toString(ints));
        }
    }
}
