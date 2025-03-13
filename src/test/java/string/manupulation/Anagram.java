package string.manupulation;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


    /**
     * Checks if two words are anagrams (contains same characters with same frequency in any order).
     *
     * @param s1 The first string to be checked
     * @param s2 The second string to be checked
     * @return true if they are anagrams of each other
     */

public class Anagram {

   public static boolean isAnagram(String s1, String s2) {

       // convert both string to lowercase to ignore case difference
       s1 = s1.toLowerCase();
       s2 = s2.toLowerCase();

       if(s1.length() != s2.length()){
           return false;
       }

        var charCount = new int[256];

        for (var i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }

        for (var count : charCount){
            if (count != 0){
                return false;
            }
        }
        return true;
    }


    @Test
    void testIsAnagram(){

        assertTrue(isAnagram("Fired", "fried"));
        assertFalse(isAnagram("Layerd", "Cared"));
    }

}
