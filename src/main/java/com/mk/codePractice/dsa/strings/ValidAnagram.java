package com.mk.codePractice.dsa.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else  {
                return false;
            }
        }

        return true;

    }

    public boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    public boolean isAnagram3(String s, String t) {
        char[] lettersFound = new char[26];

        for(char c: s.toCharArray()) {
            lettersFound[c - 'a']++;
        }

        for(char c: t.toCharArray()) {
            lettersFound[c - 'a']--;
        }

        for(int curCount: lettersFound) {
            if(curCount != 0) {
                return false;
            }
        }
        return true;
    }

}
