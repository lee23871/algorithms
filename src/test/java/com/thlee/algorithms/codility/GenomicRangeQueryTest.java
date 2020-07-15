package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class GenomicRangeQueryTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(String s, int[] p, int[] q, int[] expected) {
        // given
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

        // when
        int[] result = genomicRangeQuery.solution(s, p, q);

        // then
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of("A", new int[]{0}, new int[]{0}, new int[] {1}),
            Arguments.of("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}, new int[] {2, 4, 1})
        );
    }
}