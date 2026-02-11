package com.mk.codePractice.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    // 15. 3Sum

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int l = nums.length;
        for (int i =0 ; i < l-2 ; i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i+1;
            int right = l-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left<right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while (left<right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(input));
    }

}
