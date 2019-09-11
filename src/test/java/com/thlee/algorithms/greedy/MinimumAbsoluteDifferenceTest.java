package com.thlee.algorithms.greedy;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumAbsoluteDifferenceTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void minimumAbsoluteDifference(int[] arr, int expectedResult) {
        // Arrange

        // Act
        int result = MinimumAbsoluteDifference.minimumAbsoluteDifference(arr);

        // Assert
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{3, -7, 0}, 3),
            Arguments.of(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}, 1),
            Arguments.of(new int[]{1, -3, 71, 68, 17}, 3)
        );
    }
}
