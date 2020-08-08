package com.thlee.algorithms.codility;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FlagsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void solution(int[] a, int expected) {
        // given
        Flags flags = new Flags();

        // when
        int result = flags.solution(a);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[]{0, 0, 0, 0, 0, 1, 0, 1, 0, 1}, 2),
            Arguments.of(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}, 3),
            Arguments.of(new int[]{1, 3, 2}, 1)
        );
    }
}
