package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(int[] a, int expected) {
        // given
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

        // when
        int result = minAvgTwoSlice.solution(a);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{4, 2, 2, 5, 1, 5, 8}, 1),
            Arguments.of(new int[]{4, 2, 200, 1, 1, 1, 1}, 3),
            Arguments.of(new int[]{0, 8, 0, 0, -8, 0}, 3),
            Arguments.of(new int[]{10, 0, 10, -5, 10, 0}, 1),
            Arguments.of(new int[]{10, 10, -1, 2, 4, -1, 2, -1}, 5)
        );
    }
}
