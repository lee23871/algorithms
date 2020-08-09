package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneWallTest {

    @Test
    void solution() {
        int[] h = new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8};
        StoneWall stoneWall = new StoneWall();
        int result = stoneWall.solution(h);
        assertEquals(7, result);
    }
}