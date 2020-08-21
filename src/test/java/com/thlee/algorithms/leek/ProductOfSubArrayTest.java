package com.thlee.algorithms.leek;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfSubArrayTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void product(int[] arr, int expected) {
        // given

        // when
        long result = ProductOfSubArray.product(arr);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {

        return Stream.of(
            Arguments.of(new int[] {2, 4}, 64),
            Arguments.of(new int[] {10, 3, 7}, 27783000)
        );
    }
}
