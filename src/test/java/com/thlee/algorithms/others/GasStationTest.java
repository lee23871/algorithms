package com.thlee.algorithms.others;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void canCompleteCircuit(int[] a, int[] b, int expectedResult) {
        // Arrange
        GasStation gasStation = new GasStation();

        // Act
        int result = gasStation.canCompleteCircuit(a, b);

        // Assert
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{1, 2}, new int[]{2, 1}, 1)
        );
    }
}