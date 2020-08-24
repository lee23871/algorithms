package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Permutations2Test {

    @Test
    void permuteUnique() {
        Permutations2 permutations2 = new Permutations2();
        List<List<Integer>> lists = permutations2.permuteUnique(new int[]{3, 3, 0, 3});
        System.out.println(lists.toString());
    }
}
