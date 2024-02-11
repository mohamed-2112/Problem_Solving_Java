package main.problems;


import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestString {
    public int lengthOfLongestSubstring(String s){
//dvdf
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            // d
            //v
            //d
            //f
            if (charIndexMap.containsKey(currentChar)) {
                // contains nothing for now
                // no v
                // cantains key d
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
                //(1, 0) = 1
            }
            charIndexMap.put(currentChar, end);
            // add the char as key and index as value (d:2)
            // add the char as key and index as value (v:1)
            // add the char as key and index as value (f:3)

            maxLength = Math.max(maxLength, end - start + 1);
            //1
            //(1, 1-0+1) = 2
            //(2, 2 - 1 +1) 2
            //(2, 3 - 1 +1) 3
        }
        return maxLength;
    }




}
