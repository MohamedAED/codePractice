package com.mk.codePractice.dsa.arrays;

import java.util.Arrays;

public class RotateArray {

    private int[] nums;

    public void rotate(int[] nums, int k) {
        this.nums = nums;
        int n = nums.length;

        // Handle cases where k is greater than array length
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(0, k - 1);

        // Step 3: Reverse the remaining elements from k to end
        reverse(k, n - 1);
    }

    private void reverse(int l, int r) {
        // Swap elements from both ends moving towards the center
        while (l < r) {
            // Swap elements at positions l and r
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            // Move pointers towards center
            l++;
            r--;
        }
    }

    public void rotate2(int[] nums, int k) {
        int l = nums.length;

        k = k % l;

        for  (int i = 0; i < k; i++) {
            int last = nums[l-1];

            for (int j =l-1; j>0; j--) {
                nums[j] = nums[j-1];
            }

            nums[0] = last;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // 7 6 5 4 3 2 1
        // 5 6 7 4 3 2 1
        // 4 5 6 1 2 3 4
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate2(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

}
