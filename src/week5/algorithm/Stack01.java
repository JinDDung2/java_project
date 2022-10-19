package week5.algorithm;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack01() {}

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        arr[pointer] = value;
        pointer++;
    }

    public int pop() {
        pointer--;
        int value = arr[pointer];
        return value;
    }

    public int[] getArr() {
        return arr;
    }
}
