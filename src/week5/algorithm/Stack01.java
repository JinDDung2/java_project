package week5.algorithm;

import java.util.EmptyStackException;

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
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int value = arr[--pointer];
        return value;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public Integer[] getArr() {
        return arr;
    }

}
