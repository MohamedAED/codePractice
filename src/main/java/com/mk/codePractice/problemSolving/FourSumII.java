package com.mk.codePractice.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // HashMap to store the sum of pairs from nums1 and nums2 as key,
        // and their frequency as value
        Map<Integer, Integer> sumFrequencyMap = new HashMap<>();

        // Calculate all possible sums of pairs from nums1 and nums2
        // Store each sum and its frequency in the map
        for (int elementA : nums1) {
            for (int elementB : nums2) {
                int sum = elementA + elementB;
                // Increment the frequency of this sum
                // If sum doesn't exist, initialize with 1; otherwise, add 1 to existing count
                sumFrequencyMap.merge(sum, 1, Integer::sum);
            }
        }

        // Counter for valid four-sum combinations that equal zero
        int totalCount = 0;

        // For each pair from nums3 and nums4, check if the negation of their sum
        // exists in our map (which would make the total sum zero)
        for (int elementC : nums3) {
            for (int elementD : nums4) {
                int currentSum = elementC + elementD;
                int targetSum = -currentSum;  // Need this value from first two arrays to make total zero

                // Add the frequency of the target sum to our result
                // If targetSum doesn't exist in map, add 0
                totalCount += sumFrequencyMap.getOrDefault(targetSum, 0);
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {-2,-1};
        int[] nums3 = new int[] {-1,2};
        int[] nums4 = new int[] {0,2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

}
