package string.manupulation;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 */


public class ReverseAStringUsingCharArr {

    public void reverseString(char[] s){

        int l = 0;
        int r = s.length - 1;

        while (l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }


    @Test
    void isCharStringReversable(){
        char [] s = { 'h', 'e', 'l', 'l', 'o'};
        char[] expected = { 'o', 'l', 'l', 'e', 'h' };
        reverseString(s);
        Assertions.assertArrayEquals(expected, s);
    }
}
