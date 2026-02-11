package com.mk.codePractice.leetcodeInterviewPatterns.DFS;

import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands {

    static boolean isSafe(char[][] grid, int row, int col, boolean[][] visited, int rowLen, int columnLen) {
        return row >= 0 && row < rowLen &&
                col >= 0 && col < columnLen &&
                grid[row][col] == 'L' &&
                !visited[row][col];
    }

    static void dfs(char[][] grid, int row, int col, boolean[][] visited, int rowLen, int columnLen) {
        visited[row][col] = true;

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] item : dir) {
            int x = item[0] + row;
            int y = item[1] + col;

            if (isSafe(grid, x, y, visited, rowLen, columnLen)) {
                dfs(grid, x, y, visited, rowLen, columnLen);
            }
        }
    }

    static int countIslands(char[][] grid) {
        int rowLen = grid.length;
        int columnLen = grid[0].length;

        boolean[][] visited = new boolean[rowLen][columnLen];

        int numberOfIslands = 0;
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < columnLen; c++) {
                if (grid[r][c] == 'L' && !visited[r][c]) {
                    dfs(grid, r, c, visited, rowLen, columnLen);
                    numberOfIslands++;
                }
            }
        }

        return numberOfIslands;

    }

    public static void main(String[] args) {
        char[][] grid = {
                {'L', 'W', 'W', 'W', 'W'},
                {'W', 'L', 'W', 'W', 'L'},
                {'L', 'W', 'W', 'L', 'L'},
                {'W', 'W', 'W', 'W', 'W'},
                {'L', 'W', 'L', 'L', 'W'}
        };

        // printing the number of islands
        System.out.println(countIslands(grid));
    }

}
