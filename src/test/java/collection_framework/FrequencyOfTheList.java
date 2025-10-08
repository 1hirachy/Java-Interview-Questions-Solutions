package collection_framework;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Find frequency of elements in a list
 */
public class FrequencyOfTheList {

    public static Map<String, Integer> getFrequencies(List<String> input) {

        Map<String, Integer> freq = new HashMap<>();
        for (String s : input) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        return freq;
    }


    // Functional Style
    public static Map<String, Integer> getFrequencies2(List<String> input) {
        return input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(s -> 1)));
    }


    @Test
    void testWithEmptyList() {
        // Expected
        List<String> input = Collections.emptyList();
        Map<String, Integer> expected = Collections.emptyMap();

        // Actual
        Map<String, Integer> actual = getFrequencies2(input);

        // Assert
        assertTrue(actual.isEmpty(), "The frequency map for an empty list should be empty.");
        assertEquals(expected, actual, "The frequency map should be an empty map.");
    }

    void testWithDupElements() {

        // Expected
        List<String> input = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> expected = Map.of("apple", 3, "banana", 2, "orange", 1);

        // Actual
        Map<String, Integer> actual = getFrequencies2(input);

        // Assert
        assertEquals(expected, actual, "The frequency map should correctly count duplicate elements");

    }


    @Test
    void testWithNullElement() {
        // Expected
        List<String> input = new ArrayList<>();
        input.add("test");
        input.add(null); // ArrayList allows null elements
        input.add("test");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("test", 2);
        expected.put(null, 1);

        // Act
        Map<String, Integer> actual = getFrequencies(input);

        // Assert
        assertEquals(expected, actual, "The frequency map should correctly handle null elements as a key.");
    }
}
