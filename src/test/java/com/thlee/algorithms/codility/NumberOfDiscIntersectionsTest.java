package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiscIntersectionsTest {

    @Test
    void solutionTest1() {
        // given
        int[] a = new int[]{1, 5, 2, 1, 4, 0};
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

        // when
        int result = numberOfDiscIntersections.solution(a);

        // then
        assertEquals(11, result);
    }

    @Test
    void solutionTest2() {
        // given
        int[] a = new int[]{1, 2147483647, 0};
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

        // when
        int result = numberOfDiscIntersections.solution(a);

        // then
        assertEquals(2, result);
    }
}
