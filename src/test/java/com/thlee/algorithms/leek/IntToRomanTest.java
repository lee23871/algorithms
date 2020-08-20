package com.thlee.algorithms.leek;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class IntToRomanTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void intToRoman(int num, String expected) {
        IntToRoman intToRoman = new IntToRoman();
        String result = intToRoman.intToRoman(num);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(3, "III"),
            Arguments.of(1994, "MCMXCIV"),
            Arguments.of(400, "CD")
        );
    }
}
