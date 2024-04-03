package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountConfirmingBitsTest {

    @Test
    void solution() {
        int a = 1073741727;
        int b = 1073741631;
        int c = 1073741679;

        int solution = CountConfirmingBits.solution(a, b, c);

        System.out.println(solution);
    }
}
