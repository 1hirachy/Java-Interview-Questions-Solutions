package StringManupulation;

import java.util.*;

    /**
     * Wrote a java program to remove duplicate character from String?
     */

public class RemoveDuplicateCharacterFromString {

    public static String removeDuplicateString(String str) {

        // we need to create linked hashSet to store unique character
        Set<Character> charset = new LinkedHashSet<>();


        try {
            //Iterate through the string and each character to the Set
            for (char c : str.toCharArray()) {
                charset.add(c);
            }
        } catch (Exception e) {
           return "Invalid Input";
        }


        // create a new string without duplicate character using string builder
        StringBuilder resultSet = new StringBuilder();
        for (char c : charset) {
            resultSet.append(c);
        }

        // convert stringBuilder obj to string and return
        return resultSet.toString();
    }

    public static void main(String[] args) {

        String input = "ABACDEAFCF" ;
        System.out.println("Output: " + removeDuplicateString(input));
    }
}
