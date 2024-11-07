package StringManupulation;

import java.util.*;
import java.util.stream.Collectors;

    /**
     * Write a java program to find the duplicate characters in a string
     */
public class DuplicateCharacters {

    public static String findDuplicateChar(String str){

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
                .filter(entry -> entry.getValue() >1)
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .collect(Collectors.joining(" \n"));
        return result;
    }


    public static void main(String[] args) {

        String input = "I Love Java";
        System.out.println(findDuplicateChar(input));
    }
}
