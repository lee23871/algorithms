package com.thlee.algorithms.string;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BearAndSteadyTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void steadyGene(String gene, int expected) {

        int result = BearAndSteady.steadyGene(gene);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of("GACT", 0),
            Arguments.of("GAAATAAA", 5),
            Arguments.of("TGATGCCGTCCCCTCAACTTGAGTGCTCCTAATGCGTTGC", 5)
        );
    }
}