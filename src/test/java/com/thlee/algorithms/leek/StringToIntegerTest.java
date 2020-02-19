package com.thlee.algorithms.leek;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void myAtoi(String str, int expected) {

        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi(str);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {

        return Stream.of(
            Arguments.of("-6147483648", -2147483648),
            Arguments.of("42", 42),
            Arguments.of("    -42", -42),
            Arguments.of("    -42 asdf", -42),
            Arguments.of("asdf42", 0)
        );
    }
}