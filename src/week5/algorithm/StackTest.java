package week5.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
    }

    @Test
    @DisplayName("pop이 잘 되어있는가")
    void pushAndPop() {
        Stack01 stack = new Stack01(10);
        Integer[] arr = stack.getArr();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        stack.push(30);
        assertEquals(30, arr[1]);

    }

    @Test
    @DisplayName("stack이 비어있을 때 pop 오류")
    void stackEmptyAndPop() {
        Stack01 stack = new Stack01();
        assertThrows(EmptyStackException.class, () -> {
            stack.pop();
        });
    }

    @Test
    @DisplayName("비어있는가")
    void isEmpty() {
        Stack01 stack = new Stack01(10);
        assertTrue(stack.isEmpty());
        stack.push(100);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("모든 기능 잘 되어있는가")
    void pushAndPopAndPeekAndCount() {

    }

}