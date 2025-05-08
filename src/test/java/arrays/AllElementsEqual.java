package arrays;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
     * Returns true if all elements in array are equal.
     *
     * @param arr the array to check (not null)
     * @param <T> the element type
     * @return true if all elements in the array are equal
     */
public class AllElementsEqual {

    public static <T> boolean isAllEqual(T[] arr){

        return Arrays.stream(arr).distinct().count() == 1;
    }

    @Test
    void testingIsAllEqual(){

        var intArray = new Integer[5];
        assertTrue(isAllEqual(intArray));

        intArray[0] = 1;
        assertFalse(isAllEqual(intArray));
    }

}
