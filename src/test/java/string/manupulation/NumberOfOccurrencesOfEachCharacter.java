package string.manupulation;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

    /**
     * Write a java program to count number of occurrences of each character in a String
     */

public class NumberOfOccurrencesOfEachCharacter {

    public static String countOccurrence(String str) {

        //we need to create a linked hashmap then loop through the string and put individual char to their occurrence
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
        String result = countMap.entrySet()
                        .stream()
                        .map(entry -> entry.getKey() + " : " + entry.getValue())
                        .collect(Collectors.joining(" \n"));

        return result;
    }


    @Test
    void testCountOccurrence() {

        String input = "Count The String";
        String result = countOccurrence(input);
        System.out.println(result);
    }
}