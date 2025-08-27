package algorithm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a number x, determine whether the given number is Armstrong's number or not. A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if
 * abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
 * Here a, b, c and d are digits of input number abcd.....
 * Examples
 * Input: n = 9474
 * Output: true
 * Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474
 * Input: n =
 * Output: false
 * Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36
 */
public class ArmstrongNumbers {

    public static boolean isArmstrong(int n) {

        // converting to string
        String number = Integer.toString(n);

        int length = number.length();
        int output = 0;

        for (char c : number.toCharArray()) {
            output += (int) Math.pow(c - '0', length);
        }


        // check if equal to number
        if (output == Integer.parseInt(number)) {
            return true;
        } else {
            return false;
        }

    }

    @Test
    void testingArmstrong(){
        int input = 123;
        boolean actual = isArmstrong(input);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testingNegative(){
        int input = -123;
        boolean actual = isArmstrong(input);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
