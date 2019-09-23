package com.thlee.algorithms.others;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void findDigits(int n, int expected) {
        int result = FindDigits.findDigits(n);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(12, 2)
        );
    }
}