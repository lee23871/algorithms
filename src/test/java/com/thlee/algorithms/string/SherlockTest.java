package com.thlee.algorithms.string;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import lombok.extern.slf4j.Slf4j;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SherlockTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void isValid1(String str, String expected) {
        // Arrange

        // Act
        String result = Sherlock.isValid(str);
        log.info("str: {}, result: {}", str, result);

        // Assert
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of("aabbcd", "NO"),
            Arguments.of("aabbccddeefghi", "NO"),
            Arguments.of("abcdefghhgfedecba", "YES"),
            Arguments.of("aaaaabc", "NO"),
            Arguments.of("abcdefghhgfedecba", "YES")
        );
    }
}
