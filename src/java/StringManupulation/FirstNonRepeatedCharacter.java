package StringManupulation;

import java.util.LinkedHashMap;
import java.util.Map;

    /**
     * Write a java program to find the first non-repeated character in a String?
     */
public class FirstNonRepeatedCharacter {

    public static char firstNonRepeatedCharacter(String str) {

        // Create a LinkedHashMap to maintain the insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Convert the string to lowercase to make it case-sensitive
        str = str.toLowerCase();

        // Loop through the string and put individual characters and their occurrences into the map
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Loop through the map to find the first character with only one occurrence
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // return a placeholder character if no non-repeated character is found
        return '\0';
    }

        public static void main(String[] args) {

        String input = "Abaafwfswqq3" ;
        System.out.println(firstNonRepeatedCharacter(input));
        }

}
