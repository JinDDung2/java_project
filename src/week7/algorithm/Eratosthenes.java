package week7.algorithm;

import java.util.ArrayList;

public class Eratosthenes {
    public static void main(String[] args) {
        int N = 50;
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

        // 5. 5을 제외한 3의배수 지우기
        for (int i = 3; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 3 == 0) {
                arrayList.remove(i);
            }
        }


    }
}
