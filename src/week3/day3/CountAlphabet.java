package week3.day3;

import java.util.HashMap;

public class CountAlphabet {

    public static boolean isAlphabet(char c) {
        if (( c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abvC390AEwicC";
        s = s.toUpperCase();
//        System.out.println(s);
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char check = s.charAt(i);
            if ( isAlphabet(check) ) {
                alphabetMap.put(s.charAt(i), alphabetMap.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        System.out.println(alphabetMap);
    }
}
