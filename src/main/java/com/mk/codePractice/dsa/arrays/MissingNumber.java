package com.mk.codePractice.dsa.arrays;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        for (int i =0; i<length; i++){
            if(nums[i] != i)
                return i;
        }

        return length;
    }

    public int missingNumber2(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+nums[i];
        }
        return sum-ans;
    }

    public static void main(String[] args) {
        MissingNumber m=new MissingNumber();
        System.out.println(m.missingNumber2(new int[]{1,2,3,4,5}));
    }
}
