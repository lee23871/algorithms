package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingCountriesTest {

    @Test
    void solution() {
        int[][] a = new int[][] {
            {5, 4, 4},
            {4, 3, 4},
            {3, 2, 4},
            {2, 2, 2},
            {3, 3, 4},
            {1, 4, 4},
            {4, 1, 1}
        };

        CountingCountries countingCountries = new CountingCountries();
        int solution = countingCountries.solution(a);
        System.out.println(solution);
    }
}
