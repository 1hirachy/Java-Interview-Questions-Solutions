package collection_framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Sort list of strings by length
 */
public class SortList {

    public static Map<String, Integer> getFrequencies(List<String> input) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s : input) freq.put(s, freq.getOrDefault(s, 0) + 1);
        return freq;
        
    }
}
