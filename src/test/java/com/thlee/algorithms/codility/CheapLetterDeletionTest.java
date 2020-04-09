package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class CheapLetterDeletionTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(String S, int[] C, int expectedResult) {
        CheapLetterDeletion cheapLetterDeletion = new CheapLetterDeletion();

        int result = cheapLetterDeletion.solution(S, C);
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of("abccbd", new int[]{0, 1, 2, 3, 4, 5}, 2),
            Arguments.of("aabbcc", new int[]{1, 2, 1, 2, 1, 2}, 3),
            Arguments.of("aaaa", new int[]{3, 4, 5, 6}, 12),
            Arguments.of("ababa", new int[]{10, 5, 10, 5, 10}, 0)
        );
    }
}