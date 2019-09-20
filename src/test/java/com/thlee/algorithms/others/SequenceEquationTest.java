package com.thlee.algorithms.others;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SequenceEquationTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void permutationEquation(int[] p, int[] expected) {
        int[] result = SequenceEquation.permutationEquation(p);

        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{2, 3, 1}, new int[]{2, 3, 1}),
            Arguments.of(new int[]{5, 2, 1, 3, 4}, new int[]{4, 2, 5, 1, 3}),
            Arguments.of(new int[]{4, 3, 5, 1, 2}, new int[]{1, 3, 5, 4, 2})
        );
    }
}