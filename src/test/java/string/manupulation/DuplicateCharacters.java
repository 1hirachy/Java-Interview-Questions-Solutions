package string.manupulation;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Write a java program to find the duplicate characters in a string
 */
public class DuplicateCharacters {

    public static String findDuplicateChar(String str) {

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        // Convert the string to lowercase to make it case-sensitive

        str = str.toLowerCase();

        // Iterate over each character of the String
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                continue; //ignore white spaces
            }

            // put the characters in countMap
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Using Java Streams to build the result string
        return countMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .collect(Collectors.joining(" \n"));
    }


    @Test
    void testEmptyString() {
        String input = "";
        assertEquals("", findDuplicateChar(input), "Expected no duplicates in empty string");
        assertNotEquals(null, findDuplicateChar(input));
    }

    @Test
    void testDuplicateChar(){
        String input = "Abcda";
        assertEquals("a : 2", findDuplicateChar(input), "Expect Duplicate Character");
    }
}
