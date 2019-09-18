package com.thlee.algorithms.others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PickingNumbersTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void pickingNumbers(List<Integer> a, int expected) {

        int result = PickingNumbers.pickingNumbers(a);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(Arrays.asList(4, 6, 5, 3, 3, 1), 3),
            Arguments.of(Arrays.asList(1, 2, 2, 3, 1, 2), 5)
        );
    }
}
