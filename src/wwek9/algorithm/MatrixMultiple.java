package wwek9.algorithm;

public class MatrixMultiple {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        // 행
        for (int i = 0; i < arr1.length; i++) {
            // 열
            for (int j = 0; j < arr2[0].length; j++) {
                int num = 0;
                // 곱셈 값
                for (int k = 0; k < arr2.length; k++) {
                    num += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = num;
            }
        }
        return answer;
    }
}
