package week5.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketTest {

    @Test
    void correctBracket() {
        CorrectBracket correctBracket = new CorrectBracket();
        boolean solution = correctBracket.solutionV1("()()()(())");
        boolean solution2 = correctBracket.solutionV1(")(()");
        boolean solution3 = correctBracket.solutionV1("(())()(()");
        assertTrue(solution);
        assertFalse(solution2);
        assertFalse(solution3);

        boolean sol1 = correctBracket.solutionV2("()()()(())");
        boolean sol2 = correctBracket.solutionV2(")(()");
        boolean sol3 = correctBracket.solutionV2("(())()(()");
        assertTrue(sol1);
        assertFalse(sol2);
        assertFalse(sol3);

        boolean sol4 = correctBracket.solutionV3("()()()(())");
        boolean sol5 = correctBracket.solutionV3(")(()");
        boolean sol6 = correctBracket.solutionV3("(())()(()");
        assertTrue(sol1);
        assertFalse(sol2);
        assertFalse(sol3);
    }
}