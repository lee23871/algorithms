package com.thlee.algorithms.search;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IceCreamParlorTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void whatFlavors(int[] cost, int money, int[] expectedResult) {
        // Arrange

        // Act
        int[] result = IceCreamParlor.whatFlavors(cost, money);

        // Assert
        assertArrayEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{1, 4, 5, 3, 2}, 4, new int[]{1, 4}),
            Arguments.of(new int[]{2, 2, 4, 3}, 4, new int[]{1, 2}),
            Arguments.of(new int[]{1, 2, 3, 5, 6}, 5, new int[]{2, 3}),
            Arguments.of(new int[]{4, 3, 2, 5, 7}, 8, new int[]{2, 4})
        );
    }
}