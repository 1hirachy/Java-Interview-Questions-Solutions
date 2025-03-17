package string.manupulation;

import org.junit.jupiter.api.Test;

    /**
     * Write a java program to reverse the given String
     */

    public class ReverseString {

    public static String usingStringBuilder(String str) {

//        if (str == null || str.length() > 0){
//            return "Invalid Entry";
//        } else {
//            // we will break down the string into individual character
//            StringBuilder s = new StringBuilder(); // creating a new String builder obj
//            s.append(str); // adding the existing String to new obj
//            s.reverse(); // reversing the new obj
//            return s.toString(); // converting back to String
//        }

        // using StringBuilder class method to reverse
        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse().append(" "));
        }
        return reversed.toString().trim();
    }


    public static String reverseWord(String str) {

        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        // using for loop to iterate over the sentence back-words
        for (int i = words.length - 1; i >= 0; i--) {

            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();

    }


    @Test
    void testReverseWords() {
        System.out.println(usingStringBuilder("Life is Good"));
        System.out.println(reverseWord(" Practice till you succeed"));
    }
}
