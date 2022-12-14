package week9.algorithm;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static List<Integer> sort(List<Integer> list) {
        // 탈출조건
        if(list.size() <= 1) return list;
        // 1. 기준값 뽑기
        int pivot = list.get(list.size() / 2);
        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> lessList = new ArrayList<>();
        List<Integer> midList = new ArrayList<>();
        List<Integer> biggerList = new ArrayList<>();

        for (Integer num : list) {
            if (pivot > num) lessList.add(num);
            else if (pivot < num) biggerList.add(num);
            else midList.add(num);
        }
        /*System.out.println("pivot = " + pivot);
        System.out.println("lessList = " + lessList);
        System.out.println("midList = " + midList);
        System.out.println("biggerList = " + biggerList);*/
        return merge(sort(lessList), midList, sort(biggerList));
    }

    private static List<Integer> merge(List<Integer> less, List<Integer> mid, List<Integer> bigger) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(less);
        answer.addAll(mid);
        answer.addAll(bigger);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        System.out.println("list = " + list);
        List<Integer> sortList = sort(list);
        System.out.println("sortList = " + sortList);

    }
}
