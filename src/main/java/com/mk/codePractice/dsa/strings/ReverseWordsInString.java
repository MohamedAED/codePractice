package com.mk.codePractice.dsa.strings;

public class ReverseWordsInString {

    public String reverseWords(String s) {

        s = s.strip();
        if(s.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length-1; i>=0; i--) {
            if(!words[i].isBlank()) {
                sb.append(words[i]);
                if(i > 0)
                    sb.append(' ');
            }
        }

        return sb.toString();
    }

}
