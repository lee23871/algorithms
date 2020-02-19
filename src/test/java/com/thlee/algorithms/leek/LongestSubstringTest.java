package com.thlee.algorithms.leek;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void lengthOfLongestSubstring(String input, int expected) {
        // Arrange
        LongestSubstring longestSubstring = new LongestSubstring();

        // Act
        int result = longestSubstring.lengthOfLongestSubstring(input);

        // Assert
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of("abba", 2),
            Arguments.of("abcabcbb", 3)
        );
    }
}