package week7.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class EratosthenesV1 {
    public int getPrimeCount(int num) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 2; i < num+1; i++) {
            numList.add(i);
        }

        for (int i = 2; i < num*0.5+1; i++) {
            for (int j = 0; j < numList.size(); j++) {
                if (numList.get(j) % i == 0 && numList.get(j) > i) {
                    numList.remove(j);
                }
            }
        }
        return numList.size();
    }

    public static void main(String[] args) {

        EratosthenesV1 eratosthenes = new EratosthenesV1();
        int primeCount1 = eratosthenes.getPrimeCount(50);
        System.out.println("primeCount1 = " + primeCount1);

        int primeCount2 = eratosthenes.getPrimeCount(5);
        System.out.println("primeCount2 = " + primeCount2);

        /*int N = 50;
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1. 2~49 배열에 넣기
        for (int i = 2; i < N; i++) {
            arrayList.add(i);
        }

        // 2. 2를 제외한 2의배수 지우기
        for (int i = 1; i < arrayList.size(); i++) {
            if ( (arrayList.get(i) % 2) == 0) {
                arrayList.remove(i);
            }
        }

        // 3. 원소의 개수와 원소 출력
        System.out.println("arrayList.size() = " + arrayList.size());
        for (Integer integer : arrayList) {
            System.out.printf("%d \t", integer);
        }

        // 4. 3을 제외한 3의배수 지우기
        for (int i = 2; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 3 == 0) {
                arrayList.remove(i);
            }
        }

        // 5. 원소의 개수와 원소 출력
        System.out.println("arrayList.size() = " + arrayList.size());
        for (Integer integer : arrayList) {
            System.out.printf("%d \t", integer);
        }

        // 6. 5를 제외한 5의배수 지우기
        for (int i = 3; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 5 == 0) {
                arrayList.remove(i);
            }
        }

        // 7. 원소의 개수와 원소 출력
        System.out.println("arrayList.size() = " + arrayList.size());
        for (Integer integer : arrayList) {
            System.out.printf("%d \t", integer);
        }

        // 8. 7을 제외한 7의배수 지우기
        for (int i = 4; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 7 == 0) {
                arrayList.remove(i);
            }
        }

        // 9. 원소의 개수와 원소 출력
        System.out.println("arrayList.size() = " + arrayList.size());
        for (Integer integer : arrayList) {
            System.out.printf("%d \t", integer);
        }*/
    }
}
