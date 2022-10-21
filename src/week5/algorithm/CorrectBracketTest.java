package week5.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketTest {

    @Test
    void correctBracket() {
        CorrectBracket correctBracket = new CorrectBracket();
        boolean solution = correctBracket.solution("()()()(())");
        boolean solution2 = correctBracket.solution(")(()");
        boolean solution3 = correctBracket.solution("(())()(()");
        assertTrue(solution);
        assertFalse(solution2);
        assertFalse(solution3);

        boolean sol1 = correctBracket.solution("()()()(())");
        boolean sol2 = correctBracket.solution(")(()");
        boolean sol3 = correctBracket.solution("(())()(()");
        assertTrue(sol1);
        assertFalse(sol2);
        assertFalse(sol3);
    }
}