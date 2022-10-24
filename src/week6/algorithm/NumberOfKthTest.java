package week6.algorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfKthTest {
    @Test
    void K번째수() {
        NumberOfKth sol = new NumberOfKth();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = sol.solution(array, commands);
        int[] correct = {5, 6, 3};
        assertArrayEquals(correct, answer);
    }

}