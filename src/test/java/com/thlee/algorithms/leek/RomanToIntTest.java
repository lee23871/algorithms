package com.thlee.algorithms.leek;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void romanToInt(String str, int expected) {

        RomanToInt romanToInt = new RomanToInt();
        int result = romanToInt.romanToInt(str);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {

        return Stream.of(
            Arguments.of("MCMXCIV", 1994),
            Arguments.of("M", 1000),
            Arguments.of("MM", 2000),
            Arguments.of("MMM", 3000),
            Arguments.of("MCC", 1200),
            Arguments.of("CD", 400),
            Arguments.of("CM", 900),
            Arguments.of("C", 100),
            Arguments.of("CC", 200),
            Arguments.of("XL", 40),
            Arguments.of("XC", 90),
            Arguments.of("XX", 20),
            Arguments.of("IV", 4),
            Arguments.of("IX", 9),
            Arguments.of("II", 2)
        );
    }
}