package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(int N, int expected) {
        // given
        BinaryGap binaryGap = new BinaryGap();

        // when
        int result = binaryGap.solution(N);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(32, 0)
        );
    }
}
