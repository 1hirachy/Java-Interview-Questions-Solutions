package StringManupulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "BBst";
        System.out.println("First Non Repeated Character: " + findFirstNonRepeatedString(input));
    }
    public static Character findFirstNonRepeatedString(String str){
        Map< Character, Integer> charCountMap = new LinkedHashMap<>();
        for( char c : str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry< Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return null;
    }
}
