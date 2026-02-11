package com.mk.codePractice.leetcodeInterviewPatterns.DFS;

public class TreeHeight {

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    static int height(Node root) {
        if (root == null) return 0;

        int rightHeight = height(root.right);
        int leftHeight = height(root.left);

        return Math.max(rightHeight, leftHeight) + 1;
    }

    public static void main(String[] args) {

        // Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(height(root));
    }

}
