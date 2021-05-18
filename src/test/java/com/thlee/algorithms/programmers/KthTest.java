package com.thlee.algorithms.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthTest {

    @Test
    void solution() {
        // given
        //[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
        int[] array = new int[] { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = new int[][] {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };

        // when
        Kth kth = new Kth();
        int[] solution = kth.solution(array, commands);

        // then
        assertEquals(5, solution[0]);
        assertEquals(6, solution[1]);
        assertEquals(3, solution[2]);
    }
}