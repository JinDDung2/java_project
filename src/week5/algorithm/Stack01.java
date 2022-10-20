package week5.algorithm;

public class Stack01 {

    private Integer[] arr;
    private int pointer = 0;

    public Stack01() {
        this.arr = new Integer[10000];
    }

    public Stack01(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        arr[pointer++] = value;
    }

    public int pop() {
        int value = arr[--pointer];
        return value;
    }

    public Integer[] getArr() {
        return arr;
    }
}
