package algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseANumber {

    public static int reverseNumber(int n){
       int revNum = 0;
       while (n > 0){
           revNum = revNum * 10 + n % 10;
           n = n / 10;
       }
       return revNum;
    }


    @Test
    void testReverseNumber(){

        int input = 531;
        int expected = 135;
        int actual = reverseNumber(input);
        Assertions.assertEquals(actual, expected);

    }
}
