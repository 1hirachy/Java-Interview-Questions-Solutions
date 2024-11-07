package StringManupulation;

    /**
     * Wrote a java program to remove Specific character from String?
     */

    public class RemoveSpecificCharacter {

    // Method to remove a specific letter using regex
    public static String removingSpecificCharacter(String str, char c){

        // Convert both to lowercase and uppercase occurrences of the character
        char lowerChar = Character.toLowerCase(c);
        char upperChar = Character.toUpperCase(c);

        return str.replaceAll(String.valueOf(upperChar), "")
                .replaceAll(String.valueOf(lowerChar), "");
    }


    public static void main(String[] args) {

        String input = "Remove All the Character C";
        char c = 'C';
        System.out.println(removingSpecificCharacter(input, c));
    }
}
