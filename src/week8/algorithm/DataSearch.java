package week8.algorithm;

import java.util.Scanner;

public class DataSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int cnt = 0;

        for (int num : arr) {
            cnt++;
            if (cnt == arr.length && num != k) {
                cnt = -1;
            }
            if(num == k) {
                break;
            }
//            System.out.printf("num=%d, cnt=%d /", num, cnt);
        }
        System.out.println(cnt);
    }
}
