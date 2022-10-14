package week4.algorithm;

import java.util.Scanner;

public class Codeup1443 {

    public int[] sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>0; j--) {
                //            System.out.printf("i:%d, j:%d, j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        Codeup1443 solution = new Codeup1443();
        int[] result = solution.sort(arr);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
