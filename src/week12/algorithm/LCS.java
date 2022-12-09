package week12.algorithm;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        // str2이 세로, str1이 가로
        String[][] strList = new String[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("i: %s | j: %s \n", str2.charAt(i), str1.charAt(j));
            }
        }

    }
}
