package week10.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Recurrence {
    public void print100(int num) {
        if (num > 100) return;
        System.out.println("num = " + num);
        num++;
        print100(num);

    }

    public void printArraySum(int[] arr, int idx, int sum) {
        if (idx == arr.length) {
            System.out.println(sum);
            return;
        }
        sum += arr[idx];
        idx++;
        printArraySum(arr, idx, sum);
    }

    public void printListSum(List<Integer> list, int idx, int sum) {
        if (idx == list.size()) {
            System.out.println(sum);
            return;
        }
        sum += list.get(idx);
        idx++;
        printListSum(list, idx, sum);
    }

    public static void main(String[] args) {
        Recurrence sol = new Recurrence();
//        sol.print100(1);
//        int[] arr = {7, 3, 2, 9};
//        sol.printArraySum(arr, 0, 0);
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(9);
        sol.printListSum(list, 0, 0);
    }
}
