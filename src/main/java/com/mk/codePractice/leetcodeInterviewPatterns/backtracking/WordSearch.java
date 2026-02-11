package com.mk.codePractice.leetcodeInterviewPatterns.backtracking;

public class WordSearch {

    // 79. Word Search


    /**
     * Determines if the word exists in the board by searching all possible paths
     * @param board 2D character grid
     * @param word target word to find
     * @return true if word exists in the board, false otherwise
     */
    static boolean exist(char[][] board, String word) {
        // Initialize instance variables
        int rows = board.length;
        int cols = board[0].length;
        String targetWord = word;
        char[][] grid = board;

        // Try starting the search from every cell in the grid
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // If we find the word starting from current position, return true
                if (dfs(row, col, 0, grid, rows, cols, targetWord)) {
                    return true;
                }
            }
        }

        // Word not found in any path
        return false;
    }

    /**
     * Depth-first search to find the word starting from position (row, col)
     * @param row current row position
     * @param col current column position
     * @param charIndex current character index in the target word
     * @return true if remaining word is found from this position
     */
    static boolean dfs(int row, int col, int charIndex, char[][] grid, int rows, int cols, String targetWord) {
        // Base case: reached the last character of the word
        if (charIndex == targetWord.length() - 1) {
            return grid[row][col] == targetWord.charAt(charIndex);
        }

        // Current cell doesn't match the required character
        if (grid[row][col] != targetWord.charAt(charIndex)) {
            return false;
        }

        // Mark current cell as visited by temporarily changing its value
        char originalChar = grid[row][col];
        grid[row][col] = '0';

        // Direction vectors for exploring 4 adjacent cells (up, right, down, left)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Explore all 4 directions
        for (int[] dir : directions) {
            int nextRow = row + dir[0];
            int nextCol = col + dir[1];

            // Check if next position is valid and unvisited, then continue search
            if (nextRow >= 0 && nextRow < rows &&
                    nextCol >= 0 && nextCol < cols &&
                    grid[nextRow][nextCol] != '0' &&
                    dfs(nextRow, nextCol, charIndex + 1, grid, rows, cols, targetWord)) {
                return true;
            }
        }

        // Backtrack: restore the original character
        grid[row][col] = originalChar;

        // No valid path found from this position
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {{'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(grid, word));
    }

}
