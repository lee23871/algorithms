package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathTest {

    UniquePath uniquePath = new UniquePath();

    @Test
    void uniquePaths() {
        int i = uniquePath.uniquePaths(3, 2);
        assertEquals(3, i);
    }

    @Test
    void uniquePaths2() {
        int i = uniquePath.uniquePaths(2, 2);
        assertEquals(2, i);
    }
}