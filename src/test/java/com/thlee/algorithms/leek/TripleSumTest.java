package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleSumTest {

    @Test
    void threeSum() {
        // given
        int[] arr = new int[]{-2, 0, 1, 1, 2};
        TripleSum tripleSum = new TripleSum();
        List<List<Integer>> lists = tripleSum.threeSum(arr);
        System.out.println(lists);
    }
}