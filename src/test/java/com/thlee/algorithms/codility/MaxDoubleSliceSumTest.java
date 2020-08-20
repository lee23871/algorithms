package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MaxDoubleSliceSumTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(int[] a, int expected) {
        // given
        MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();

        // when
        int result = maxDoubleSliceSum.solution(a);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{-2, 1, 1, 1, 1, 1, -7}, 4),
            Arguments.of(new int[]{-2, 1, 1, -1, 1, -10, -7}, 3),
            Arguments.of(new int[]{-2, -3, -4, 1, -5, -6, -7}, 1),
            Arguments.of(new int[]{-8, 10, 20, -5, -7, -4}, 30),
            Arguments.of(new int[]{0, 10, -5, -2, 0}, 10),
            Arguments.of(new int[]{3, 2, 6, -1, 4, 5, -1, 2}, 17),
            Arguments.of(new int[]{5, 17, 0, 3}, 17)
        );
    }

}