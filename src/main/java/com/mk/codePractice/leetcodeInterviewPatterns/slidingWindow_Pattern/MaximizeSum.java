package com.mk.codePractice.leetcodeInterviewPatterns.slidingWindow_Pattern;

public class MaximizeSum {

    // 2656. Maximum Sum With Exactly K Elements

    public static int maximizeSum(int[] nums, int k) {
        int l = nums.length;

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i =0; i <l; i++){
            if (max < nums[i]){
                max = nums[i];
            }
        }


        while(k > 0){
            sum += max;
            k--;
            max ++;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] array = new int[]{5,5,5};
        System.out.println(maximizeSum(array, 2));
    }

}
