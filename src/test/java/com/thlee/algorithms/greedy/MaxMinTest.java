package com.thlee.algorithms.greedy;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void maxMin(int k, int[] arr, int expectedResult) {
        // Arrange

        // Act
        int result = MaxMin.maxMin(k, arr);

        // Assert
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(3, new int[]{10, 100, 300, 200, 1000, 20, 30}, 20),
            Arguments.of(4, new int[]{1, 2, 3, 4, 10, 20, 30, 40, 100, 200}, 3),
            Arguments.of(2, new int[]{1, 2, 1, 2, 1}, 0)
        );
    }
}