package string.manupulation;

import org.junit.jupiter.api.Test;

/**
     * Wrote a java program to remove Specific character from String?
     */

    public class RemoveSpecificCharacter {

    // Method to remove a specific letter using regex
    public static String removingSpecificChar(String str, char c){

        // Convert both to lowercase and uppercase occurrences of the character
        char lowerChar = Character.toLowerCase(c);
        char upperChar = Character.toUpperCase(c);

        return str.replaceAll(String.valueOf(upperChar), "")
                .replaceAll(String.valueOf(lowerChar), "");
    }


    @Test
    void testRemovingSpecificCharacter() {

        String input = "Remove All the Character C";
        char c = 'C';
        System.out.println(removingSpecificChar(input, c));
    }
}
