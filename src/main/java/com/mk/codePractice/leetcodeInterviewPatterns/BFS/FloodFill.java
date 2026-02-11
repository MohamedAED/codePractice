package com.mk.codePractice.leetcodeInterviewPatterns.BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FloodFill {

    public static int[][] floodFill(int[][] img, int sr, int sc, int newColor) {
        int[][] dir = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int currentColor = img[sr][sc];

        Queue<int[]> q = new LinkedList<>();
        Set<int[]> visited = new HashSet<>();

        int[] root = new int[]{sr, sc};
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                int[] poll = q.poll();
                visited.add(poll);
                img[poll[0]][poll[1]] = newColor;
                size--;

                for (int[] it: dir){
                    int newX = poll[0] + it[0];
                    int newY = poll[1] + it[1];

                    if (newX >=0 && newX < img.length && newY >= 0 && newY < img[0].length &&
                            !visited.contains(new int[]{newX, newY}) && img[newX][newY] == currentColor) {
                        q.add(new int[]{newX, newY});
                    }
                }
            }
        }

        return img;
    }

    public static void main(String[] args) {
        int[][] img = {
                {1, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1}
        };

        int sr = 1, sc = 2;
        int newColor = 2;

        int[][] result = floodFill(img, sr, sc, newColor);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

}
