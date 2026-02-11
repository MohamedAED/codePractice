package com.mk.codePractice.problemSolving;

public class Permutation {

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void helper(char[] arr, int left, int right) {
        if (left == right)
            System.out.println(new String(arr));
        else {
            for (int i = left; i <= right; i++){
                swap(arr, left, i);
                helper(arr, left + 1, right);
                swap(arr, left, i);
            }
        }
    }

    public static void permutation(String s){
        int l =  s.length();
        char[] arr = s.toCharArray();
        helper(arr, 0, l-1);
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation(s);
    }

}
