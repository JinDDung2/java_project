package week3.day1;

public class ArrayTest {
    public static void main(String[] args) {
        // 10칸 int 배열 만들고 1부터 10까지 채워넣기
        int[] arr = new int[10];
        for(int i=0; i< arr.length; i++) {
            arr[i] = i;
        }
    }
}
