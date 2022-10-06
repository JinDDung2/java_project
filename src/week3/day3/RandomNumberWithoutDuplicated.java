package week3.day3;

import java.util.HashSet;

public class RandomNumberWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        HashSet<Integer> setInteger = new HashSet<>();
        HashSet<Character> setAlphabet = new HashSet<>();

        for (int i=0; i<50; i++) {
            int r = randomNumberGenerator.create(10);
            setInteger.add(r);
        }

        for (int i=0; i<26; i++) {
            char alphabet = (char) (randomNumberGenerator.create(26)+65);
            setAlphabet.add(alphabet);
        }

        System.out.println(setInteger);
        System.out.println(setAlphabet);

    }

}
