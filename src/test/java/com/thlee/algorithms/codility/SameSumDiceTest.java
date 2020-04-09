package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SameSumDiceTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(int[] A, int[] B, int expectedResult) {
        SameSumDice sameSumDice = new SameSumDice();
        int result = sameSumDice.solution(A, B);

        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{5}, new int[]{1, 1, 6}, 1),
            Arguments.of(new int[]{1, 1, 6}, new int[]{5}, 1),
            Arguments.of(new int[]{2, 3, 1, 1, 2}, new int[]{5, 4, 6}, 2),
            Arguments.of(new int[]{5, 4, 1, 2, 6, 5}, new int[]{2}, 6),
            Arguments.of(new int[]{1, 2, 3, 4, 3, 2, 1}, new int[]{6}, -1)
        );
    }
}