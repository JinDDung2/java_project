package week5.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void pushTest() {
        Stack01 stack = new Stack01(10);
        Integer[] arr = stack.getArr();
        stack.push(10);
        stack.push(20);
        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);
    }

    @Test
    @DisplayName("pop이 잘 되어있는가")
    void pushAndPop() {
        Stack01 stack = new Stack01(10);
        Integer[] arr = stack.getArr();
        stack.push(10);
        stack.push(20);
        Assertions.assertEquals(20, stack.pop());
        stack.push(30);
        Assertions.assertEquals(30, arr[1]);

    }
    @Test
    @DisplayName("모든 기능 잘 되어있는가")
    void pushAndPopAndPeekAndCount() {

    }

}