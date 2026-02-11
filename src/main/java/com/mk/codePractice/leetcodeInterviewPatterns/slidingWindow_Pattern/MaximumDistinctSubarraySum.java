package com.mk.codePractice.leetcodeInterviewPatterns.slidingWindow_Pattern;


import java.util.HashMap;
import java.util.Map;

public class MaximumDistinctSubarraySum {
    // 2461. Maximum Sum of Distinct Subarrays With Length K

    public static long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;

        // HashMap to track frequency of elements in current window
        Map<Integer, Integer> frequencyMap = new HashMap<>(k);

        // Initialize the first window of size k
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            frequencyMap.merge(nums[i], 1, Integer::sum);
            currentSum += nums[i];
        }

        // If all k elements are distinct, set initial answer to current sum, otherwise 0
        long maxSum = (frequencyMap.size() == k) ? currentSum : 0;

        // Slide the window through the rest of the array
        for (int i = k; i < n; i++) {
            // Add the new element to the window
            frequencyMap.merge(nums[i], 1, Integer::sum);

            // Remove the leftmost element from the window
            int leftElement = nums[i - k];
            if (frequencyMap.merge(leftElement, -1, Integer::sum) == 0) {
                frequencyMap.remove(leftElement);
            }

            // Update the current window sum
            currentSum = currentSum + nums[i] - nums[i - k];

            // If all elements in window are distinct, update max sum
            if (frequencyMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(arr, 3));
    }
}
