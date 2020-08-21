package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStrMathTest {

    @Test
    void repeatedStringMatch() {
        RepeatedStrMath repeatedStrMath = new RepeatedStrMath();
        int i = repeatedStrMath.repeatedStringMatch("abc", "cabcabca");
        assertEquals(4, i);
    }
}
