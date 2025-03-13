package string.manupulation;

import org.junit.jupiter.api.Test;

    /**
     * Write a java program to find total number of words in a String?
     */

public class TotalNumberOfWords {

    public static int numberOfWords(String str) {

        //  Trim leading and trail spaces
        str = str.trim();

        // Return 0 if the String is empty
        if (str.isEmpty()) {
            return 0;
        }

        // Split the String based on one or more whitespace character
        String[] words = str.split("\\s");

        return words.length;
    }


    @Test
    void testNumberOfWords() {

        String input = "Hello, Here is the sample string with multiple words";
        String input2 = " ";

        System.out.println("Number of words for Input: " + numberOfWords(input));
        System.out.println("Number of words for Input: " + numberOfWords(input2));

    }
}
