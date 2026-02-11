package com.mk.codePractice.leetcodeInterviewPatterns.binarySearch;

public class FirstTrueFinder {

    public static int findFirstTrue(boolean[] arr) {

        int l = arr.length;

        int left = 0;
        int right = l - 1;
        int mid;
        int firstTrue = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid]) {
                firstTrue = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstTrue;

    }

    public static void main(String[] args) {
        boolean[] arr1 = {false, false, true, true, true};
        System.out.println("Array 1: " + findFirstTrue(arr1)); // Output: 2

        boolean[] arr2 = {true, true, true};
        System.out.println("Array 2: " + findFirstTrue(arr2)); // Output: 0

        boolean[] arr3 = {false, false, false};
        System.out.println("Array 3: " + findFirstTrue(arr3)); // Output: -1

        boolean[] arr4 = {};
        System.out.println("Array 4: " + findFirstTrue(arr4)); // Output: -1
    }

}
