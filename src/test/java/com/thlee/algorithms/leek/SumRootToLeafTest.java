package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafTest {

    @Test
    void sumNumbers() {
        TreeNode c = new TreeNode(3);
        TreeNode b = new TreeNode(2);
        TreeNode a = new TreeNode(1, b, c);
        SumRootToLeaf sumRootToLeaf = new SumRootToLeaf();
        int i = sumRootToLeaf.sumNumbers(a);
        System.out.println(i);
    }
}