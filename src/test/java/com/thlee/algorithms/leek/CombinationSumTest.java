package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    @Test
    void combinationSum() {
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> lists = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(lists.toString());
    }
}