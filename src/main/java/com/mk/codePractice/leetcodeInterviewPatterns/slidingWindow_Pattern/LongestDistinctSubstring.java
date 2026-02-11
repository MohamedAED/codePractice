package com.mk.codePractice.leetcodeInterviewPatterns.slidingWindow_Pattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestDistinctSubstring {

    public static int longestDistinctSubstring (String str) {
        int max = 0;

        int l = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            map.put(str.charAt(i), 0);
        }

        int left=0;
        for (int right=0; right<l; right++) {
            char c = str.charAt(right);
            map.put(c, map.get(c)+1);
            while (map.get(c) > 1){
                map.put(str.charAt(left), map.get(str.charAt(left))-1);
                left++;
            }

            max = Math.max(max, right-left+1);

        }

        return max;

    }

    public static void main(String[] args) {
        String str = "abcdbea";
        System.out.println(longestDistinctSubstring(str));
    }

}
