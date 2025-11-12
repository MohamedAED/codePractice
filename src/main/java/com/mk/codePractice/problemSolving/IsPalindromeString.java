package com.mk.codePractice.problemSolving;

public class IsPalindromeString {

    public boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }

    public String reverseString(String s){
        if (s == null || s.isEmpty())
            return "";

        return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1));
    }

}
