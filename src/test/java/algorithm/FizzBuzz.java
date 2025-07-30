package algorithm;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates a list of strings representing the FizzBuzz sequence up to n.
 *
 * @param n The number up to which the FizzBuzz sequence should be generated.
 * @return A list of strings corresponding to the FizzBuzz sequence.
 */

public class FizzBuzz {

    public List<String> fizzbuzz(int n){

        // Initialize an ArrayList to hold the FizzBuzz results
        List <String> result = new ArrayList<>();

        // Check if the number is divisible by 3 and append "Fizz" if it is
        for (int i = 1; i <= n; ++i) {
            // Check if the number is divisible by 5 and append "Buzz" if it is

            boolean divisibleByThree = (i % 3 == 0);
            boolean divisibleByFive = (i % 5 == 0);

            if (divisibleByThree && divisibleByFive){
                result.add("FizzBuzz");
            } else if (divisibleByThree){
                result.add("Fizz");
            } else if (divisibleByFive){
                result.add("Buzz");
            } else {
                // If the string is still empty, the number is neither divisible by 3 nor 5
                // Convert the number to string and use it as the current answer
                result.add(String.valueOf(i));
            }



            // Add the current answer to the list

        }

        // Return the complete list of FizzBuzz results
        return result;
    }

    @Test
    void isFizzBuzz(){
        //to do
    }
}
