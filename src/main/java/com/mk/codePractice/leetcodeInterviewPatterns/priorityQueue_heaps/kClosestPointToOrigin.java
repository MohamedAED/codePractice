package com.mk.codePractice.leetcodeInterviewPatterns.priorityQueue_heaps;

import java.util.Arrays;

public class kClosestPointToOrigin {

    // 973. K Closest Points to Origin

    public static int[][] kClosest(int[][] points, int k) {
        // Sort points based on their Euclidean distance from the origin
        // Using Math.hypot to calculate the distance: sqrt(x^2 + y^2)
        Arrays.sort(points, (point1, point2) -> {
            double distance1 = Math.hypot(point1[0], point1[1]);
            double distance2 = Math.hypot(point2[0], point2[1]);

            // Compare distances and return appropriate comparison result
            if (distance1 - distance2 > 0) {
                return 1;  // point1 is farther from origin
            } else {
                return -1; // point1 is closer or equal distance from origin
            }
        });

        // Return the first k points after sorting
        return Arrays.copyOfRange(points, 0, k);
    }

    public static void main(String[] args) {
        int[][] points = {{3,3}, {5,-1}, {-2,4}};
        System.out.println(Arrays.deepToString(kClosest(points, 2)));
    }

}
