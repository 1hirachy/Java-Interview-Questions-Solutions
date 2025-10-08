package collection_framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Finds duplicate elements in a given list using Java streams.
  * @param <T>  The type of elements in the list.
 * @param list The list to search for duplicates.
 * @return A Set containing the duplicate elements found in the list.
 */
public class FindDuplicates {

    public static <T> Set<T> findingDuplicates(List<T> input) {

        Set<T> uniqueElements = new HashSet<>();
        return input.stream().filter(e -> !uniqueElements.add(e)) //If add returns false, it's a duplicate
                .collect(Collectors.toSet()); //Collect all duplicates into a Set

    }

    @Test
    void testingWithDuplicateElements() {
        List<Integer> input = List.of(1, 2, 3, 2, 4, 1, 5, 3);
        Set<Integer> actual = findingDuplicates(input);
        Set<Integer> expected = Set.of(1, 2, 3);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testingWithNonDuplicateElements() {
        List<Integer> input = List.of(1, 2, 3, 5, 7);
        Set<Integer> actual = findingDuplicates(input);
        Set<Integer> expected = Set.of();
        Assertions.assertEquals(actual, expected);
    }
}
