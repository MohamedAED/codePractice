package com.mk.codePractice.leetcodeInterviewPatterns.slidingWindow_Pattern;

import java.util.HashMap;
import java.util.Map;

public class MaxSubarrayLength {
    // 325. Maximum Size Subarray Sum Equals k

    public static int maxSubArrayLen(int[] nums, int k) {
        // HashMap to store cumulative sum and its earliest index
        // Key: cumulative sum, Value: earliest index where this sum occurs
        Map<Long, Integer> sumToIndexMap = new HashMap<>();

        // Initialize with sum 0 at index -1 (before array starts)
        // This handles subarrays starting from index 0
        sumToIndexMap.put(0L, -1);

        // Variable to track the maximum subarray length
        int maxLength = 0;

        // Running cumulative sum
        long cumulativeSum = 0;

        // Iterate through the array
        for (int currentIndex = 0; currentIndex < nums.length; ++currentIndex) {
            // Update cumulative sum
            cumulativeSum += nums[currentIndex];

            // Check if (cumulativeSum - k) exists in map
            // If it exists at index j, then sum from (j+1) to currentIndex equals k
            // Length would be currentIndex - j
            long targetSum = cumulativeSum - k;
            if (sumToIndexMap.containsKey(targetSum)) {
                int subarrayLength = currentIndex - sumToIndexMap.get(targetSum);
                maxLength = Math.max(maxLength, subarrayLength);
            }

            // Store the earliest occurrence of this cumulative sum
            // Only add if this sum hasn't been seen before (to keep earliest index)
            sumToIndexMap.putIfAbsent(cumulativeSum, currentIndex);
        }

        return maxLength;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
//        System.out.println(maxSubArrayLen(nums, 2));

        int[] nums1 = new int[]{1, -1, 5, -2, 3};
        System.out.println(maxSubArrayLen(nums1, 3));
    }
}
