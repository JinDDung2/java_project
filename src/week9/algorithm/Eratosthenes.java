package week9.algorithm;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        final int N = 50;
        int[] arr = new int[N-1];
        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }
        System.out.println("[ago]arr = " + Arrays.toString(arr));

        for (int i = 2; i*i <= N; i++) {
            for (int j = 2; j * i <= N; j++) {
                arr[i * j - 2] = 0;
            }
        }
        System.out.println("[after]arr = " + Arrays.toString(arr));
    }
}
