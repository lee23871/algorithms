package com.thlee.algorithms.string;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void makeAnagram(String a, String b, Integer expectedOutput) {
        // Arrange

        // Act
        int result = Anagram.makeAnagram(a, b);

        // Assert
        assertEquals(expectedOutput, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of("cde", "abc", 4),
            Arguments.of("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke", 30),
            Arguments.of("showman", "woman", 2)
        );
    }
}
