package week13.algorithm;

public class MinCost {
    public static int move(int[][] arr, int a, int b) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 && j != 0) {
                    arr[i][j] += arr[i][j - 1];
                } else if (j == 0 && i != 0) {
                    arr[i][j] += arr[i - 1][j];
                } else if (i != 0 && j != 0) {
                    int m;
                    m = Math.min(arr[i - 1][j], arr[i][j - 1]);
                    m = Math.max(m, arr[i - 1][j - 1]);
                    arr[i][j] += m;
                }
            }
        }
        return arr[a - 1][b - 1];

    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3, 2}, {4, 6, 2,}, {1, 2, 4}};
        System.out.println("move(arr) = " + move(arr, 2, 2));
    }
}
