package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void solution() {
        // given
        MissingInteger missingInteger = new MissingInteger();

        // when
        int result = missingInteger.solution(new int[] {1, 2, 3});

        // then
        assertEquals(4, result);
    }
}