package com.mk.codePractice.dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int length = s.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0;

        int left = 0;

        for (int right = 0 ; right < length; right++) {

            char currentChar = s.charAt(right);

            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            while (map.get(currentChar) > 1) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public int lengthOfLongestSubstring2(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxcount=0;
        for(int right=0;right<s.length();right++){

            char curr = s.charAt(right);
            // remove the duplicate
            if(map.containsKey(curr)){
                left=Math.max(left,map.get(curr)+1);
            }
            // updating the map with new char
            map.put(curr,right);
            //
            maxcount=Math.max(maxcount,right-left+1);

        }
        return maxcount;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

}
