package com.mk.codePractice.leetcodeInterviewPatterns.slidingWindow_Pattern;

public class MaxSubarraySum {

    // Maximum sum of a subarray of size k

    public static int  maxSubarraySum(int[] nums, int k) {

        int l = nums.length;

        int max = 0;
        for (int i=0; i<k; i++)
            max += nums[i];

        int windowSum = max;
        for (int i =k; i< l; i++){
            windowSum -= nums[i-k];
            windowSum += nums[i];
            if (windowSum > max)
                max = windowSum;
        }

        return max;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = new int[]{100,200,300,400};
        System.out.println(maxSubarraySum(arr2, 2));
    }

}
