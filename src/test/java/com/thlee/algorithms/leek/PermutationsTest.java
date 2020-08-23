package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void permute() {
        Permutations permutations = new Permutations();
        List<List<Integer>> permute = permutations.permute(new int[]{1, 2, 3});
        System.out.println(permute);
    }
}