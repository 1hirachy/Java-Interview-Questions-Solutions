package string.manupulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Write a java program to remove all the spaces exist in the String

public class RemoveAllTheSpaces {

    public static String removeSpaces(String str) {

        if (str.length() == 0) {
            return "Invalid Input";
        } else {

            StringBuilder sb = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (c != ' ') {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }


    @Test
    void testRemoveSpaces() {

        String input = "Computer is computing !";
        Assertions.assertEquals("Computeriscomputing!", removeSpaces(input));
    }
}