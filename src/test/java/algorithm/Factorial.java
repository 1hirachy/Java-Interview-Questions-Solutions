package algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a non-negative integer n, compute and return its factorial
 * input 3, output 1 * 2 * 3 = 6
 */
public class Factorial {

    public static int factorial(int n) {

        // safeguarding for negative int
        if (n < 0) {
            throw new IllegalArgumentException("Input must be positive number");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }


    @Test
    void testIsFactorial() {
        int input = 9;
        int expected = 362880;
        int actual = factorial(input);

        Assertions.assertEquals(expected, actual);
    }
}
