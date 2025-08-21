package string.manupulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseANumber {

    public static int reverseNumber(int n){
        StringBuffer sb  = new StringBuffer(String.valueOf(n));

        sb.reverse();
        n = Integer.parseInt(String.valueOf(sb));
        return n;
    }


    @Test
    void testReverseNumber(){

        int input = 221;
        int expected = 122;
        int actual = reverseNumber(input);
        Assertions.assertEquals(actual, expected);

    }
}
