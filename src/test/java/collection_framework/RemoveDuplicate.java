package collection_framework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Remove a duplicate using List Interface
 */
public class RemoveDuplicate {


    public static Set<String> removeDuplicate(List input) {
        return new HashSet<>(input);
    }


    @Test
    public void testRemoveDuplicateWithDuplicates() {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Set<String> expectedOutput = new HashSet<>(Arrays.asList("apple", "banana", "orange"));
        Set<String> actualOutput = RemoveDuplicate.removeDuplicate(input);

        assertEquals(expectedOutput, actualOutput);
    }
}
