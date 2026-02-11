package com.mk.codePractice.leetcodeInterviewPatterns.binarySearch;

public class FindMinInRotatedSortedArray {

    public static int findMin(int[] arr) {
        int l = arr.length;
        int left = 0;
        int right = l - 1;
        int result = -1;
        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[l-1]) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return arr[result];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(findMin(arr));
    }

}
