package com.mk.codePractice.leetcodeInterviewPatterns.hashMap_Pattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // this is an example of a hash map pattern

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int n= nums.length;
        for (int i = 0; i<n; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

}
