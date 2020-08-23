package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubSetTest {

    @Test
    void subsets() {
        SubSet subSet = new SubSet();
        List<List<Integer>> subsets = subSet.subsets(new int[]{1, 2, 3});
        System.out.println(subsets.toString());
    }
}