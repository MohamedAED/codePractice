package com.mk.codePractice.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        // Edge case: need at least 4 numbers
        if (length < 4) {
            return result;
        }

        // Sort the array to enable two-pointer technique
        Arrays.sort(nums);

        // First number: iterate through possible first elements
        for (int first = 0; first < length - 3; first++) {
            // Skip duplicate values for the first number
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            // Second number: iterate through possible second elements
            for (int second = first + 1; second < length - 2; second++) {
                // Skip duplicate values for the second number
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                // Two-pointer approach for the remaining two numbers
                int left = second + 1;
                int right = length - 1;

                while (left < right) {
                    // Use long to prevent integer overflow
                    long sum = (long) nums[first] + nums[second] + nums[left] + nums[right];

                    if (sum < target) {
                        // Sum is too small, move left pointer right
                        left++;
                    } else if (sum > target) {
                        // Sum is too large, move right pointer left
                        right--;
                    } else {
                        // Found a valid quadruplet
                        result.add(List.of(nums[first], nums[second], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicate values for the third number
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate values for the fourth number
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};
        System.out.println(fourSum(input, 0));
    }
}
