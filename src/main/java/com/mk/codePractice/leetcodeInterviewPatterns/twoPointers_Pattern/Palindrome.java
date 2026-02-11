package com.mk.codePractice.leetcodeInterviewPatterns.twoPointers_Pattern;

public class Palindrome {

    // this is an example of two pointers pattern

    public static boolean isPalindrome(String str) {

        int n = str.length();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            while (left < right & !Character.isLetterOrDigit(str.charAt(left)))
                left++;
            while (left < right & !Character.isLetterOrDigit(str.charAt(right)))
                right--;
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "  1,2.3.abc  cb//a3,2.1";
        System.out.println(isPalindrome(str));
    }

}
