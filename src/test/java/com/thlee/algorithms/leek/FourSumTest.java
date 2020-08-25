package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {

    @Test
    void fourSum() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> lists = fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println(lists.toString());
    }
}
