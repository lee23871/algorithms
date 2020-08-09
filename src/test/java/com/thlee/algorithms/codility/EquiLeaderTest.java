package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquiLeaderTest {

    @Test
    void solution() {
        int[] a = new int[]{4, 3, 4, 4, 4, 2};

        EquiLeader equiLeader = new EquiLeader();
        int result = equiLeader.solution(a);
        assertEquals(2, result);
    }
}