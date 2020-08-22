package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void nextPermutation() {
        int[] nums = new int[]{5, 1, 1};
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(nums);
        System.out.println(nums);
    }
}
