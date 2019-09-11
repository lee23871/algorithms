package com.thlee.algorithms.greedy;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class GreedyFloristTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void getMinimumCost(int k, int[] c, int expectedResult) {
        // Arrange

        // Act
        int result = GreedyFlorist.getMinimumCost(k, c);

        // Assert
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(3, new int[]{2, 5, 6}, 13),
            Arguments.of(2, new int[]{2, 5, 6}, 15),
            Arguments.of(3, new int[]{1, 3, 5, 7, 9}, 29)
        );
    }
}
