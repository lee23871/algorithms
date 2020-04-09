package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AlternatingCoinsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(int[] A, int expectedResult) {

        AlternatingCoins alternatingCoins = new AlternatingCoins();
        int result = alternatingCoins.solution(A);

        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{1, 0, 1, 0, 1, 1}, 1),
            Arguments.of(new int[]{1, 1, 0, 1, 1}, 2),
            Arguments.of(new int[]{0, 1, 0}, 0),
            Arguments.of(new int[]{0, 1, 1, 0}, 2)
        );
    }
}