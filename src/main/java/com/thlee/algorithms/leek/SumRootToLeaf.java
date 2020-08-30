package com.thlee.algorithms.leek;

import java.util.Stack;

public class SumRootToLeaf {

    public int sumNumbers(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int sum = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                node.left.val += node.val * 10;
                stack.push(node.left);
            }

            if (node.right != null) {
                node.right.val += node.val * 10;
                stack.push(node.right);
            }

            if (node.left == null && node.right == null) {
                sum += node.val;
            }

        }
        return sum;
    }
}
