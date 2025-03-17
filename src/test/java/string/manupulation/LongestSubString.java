package string.manupulation;
import java.util.*;

public class LongestSubString {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     */

//    public static int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        int left = 0;
//        Map<Character, Integer> count = new HashMap<>();
//
//        for (int right = 0; right < s.length(); right++) {
//            char c = s.charAt(right);
//            count.put(c, count.getOrDefault(c, 0) + 1);
//
//            while (count.get(c) > 1) {
//                char leftChar = s.charAt(left);
//                count.put(leftChar, count.get(leftChar) - 1);
//                left++;
//            }
//
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
//
//        return maxLength;
//    }

        public static int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            Set<Character> charSet = new HashSet<>();
            int left = 0;

            for (int right = 0; right < s.length(); right++) {
                if (!charSet.contains(s.charAt(right))) {
                    charSet.add(s.charAt(right));
                    maxLength = Math.max(maxLength, right - left + 1);
                } else {
                    while (charSet.contains(s.charAt(right))) {
                        charSet.remove(s.charAt(left));
                        left++;
                    }
                    charSet.add(s.charAt(right));
                }
            }

            return maxLength;
        }


    public static void main(String[] args) {

        String input = "abcdefadf";
        String input2 = "aabbcczz";
        String invalidInput = "";

        System.out.println(lengthOfLongestSubstring(input));
        System.out.println(lengthOfLongestSubstring(input2));
        System.out.println(lengthOfLongestSubstring(invalidInput));

    }
}






