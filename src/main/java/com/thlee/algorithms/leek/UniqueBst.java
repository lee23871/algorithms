package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueBst {

    public List<TreeNode> generateTrees(int n) {
        return bst(1, n);
    }

    private List<TreeNode> bst(int min, int max) {

        if (min > max) {
            return Collections.singletonList(null);
        }
        if (min == max) {
            return Collections.singletonList(new TreeNode(min));
        }

        List<TreeNode> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            List<TreeNode> leftList = bst(min, i - 1);
            List<TreeNode> rightList = bst(i + 1, max);

            // Find combinations
            for (TreeNode left : leftList) {
                for (TreeNode right : rightList) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
