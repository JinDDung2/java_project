package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("zz");
        set1.add("zz");

        System.out.println(set1);

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(2);

        System.out.println(setInteger);
    }
}
