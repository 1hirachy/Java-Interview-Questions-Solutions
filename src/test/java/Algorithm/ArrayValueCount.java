package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
    # Given an array which will contain various numeric values,
    # return how many times each value is observed in the array before its current position.
    # E.g. given [5, 4, 5, 9, 5, 5]
    # return [0, 0, 1, 0, 2, 3]
    */

public class ArrayValueCount {

    public static int[] countObservations(int[] nums){

        // we will return the observation count using the result array
        int[] result = new int[nums.length];

        // we will create a map where we will count each number occurrence
        Map <Integer, Integer> countMap = new HashMap<>();

        // we will loop through nums array and for each occurrence we will place them in map
        for(int i = 0; i < nums.length; i++){
            int currentValue = nums[i];

            //get the current of the current value observed so far
            int count = countMap.getOrDefault(currentValue, 0);
            result [i] = count;

            //update the count in the map for the current value
            countMap.put(currentValue, count + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] testOne = {5, 0, 5, 6, 4, 6};
        int[] result = countObservations(testOne);

        for (int count: result){
            System.out.println(count + " ");
        }
    }

}
