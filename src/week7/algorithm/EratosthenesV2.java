package week7.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class EratosthenesV2 {
    public int getPrimeCount(int num) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < num + 1; i++) {
            numList.add(i);
        }

        boolean[] memo = new boolean[numList.size()];
        Arrays.fill(memo, true);
        memo[0] = false;
        memo[1] = false;
//        System.out.println(Arrays.toString(memo));

        for (int i = 2; i < num * 0.5 + 1; i++) {
            if (memo[i]) {
                int j = 2;
                while (i*j < num+1) {
                    memo[i*j] = false;
                    j++;
                }
            }
        }
//        System.out.println(Arrays.toString(memo));
        int count = 0;
        for (boolean check : memo) {
            if (check) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        EratosthenesV2 eratosthenes = new EratosthenesV2();
        int primeCount1 = eratosthenes.getPrimeCount(50);
        System.out.println("primeCount1 = " + primeCount1);

        int primeCount2 = eratosthenes.getPrimeCount(1000000);
        System.out.println("primeCount2 = " + primeCount2);


    }
}
