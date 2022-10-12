package week4.algorithm;

public class MaxNumber {

    public int[] getMaxIdx(int[] arr) {
        // max값을 0으로 초기화할 경우 배열 안의 수가 모두 음수이면 0이 최댓값이 되어버려서 원하는 값이 나오지 않음
        int[] result = {arr[0], 0}; // max, maxIdx
        for (int i=1; i<arr.length; i++) {
            // max 값보다 더 큰 값이 존재하면 큰 값을 max 값으로 바꿈
            // 바꾸었을 때의 인덱스를 idx에 저장턴
            if(result[0] < arr[i]) {
                result[0] = arr[i];
                result[1] = i;
            }
        }
        return result;
    }
}
