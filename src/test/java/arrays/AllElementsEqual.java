package arrays;


import java.util.Arrays;

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
}
