package algorithm;

import java.util.*;

public class TwoSum {

    public static int [] twoSum(int [] nums, int target){

        // create a map to store the numbers and their indices
        Map<Integer, Integer> numMap = new LinkedHashMap<>();

        // Iterate over the numbers in the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the complement of the current number
            int complement = target - nums[i];

             // If the complement exists in the map, return the indices
            if(numMap.containsKey(complement)){
            return new int[] {numMap.get(complement), i};
            }

            // Otherwise, add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // If no two numbers sum up to the target, return null
        throw new IllegalArgumentException("No two sum solution");
    }


     public static void main(String[] args) {

        int [] input = {3, 3};
        int target = 6;

       // twoSum(input, target);
        System.out.println(Arrays.toString(twoSum(input, target)));

    }
}
