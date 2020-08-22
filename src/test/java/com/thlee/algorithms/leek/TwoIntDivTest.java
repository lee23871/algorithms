package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoIntDivTest {

    @Test
    void divide() {
        TwoIntDiv twoIntDiv = new TwoIntDiv();
        int divide = twoIntDiv.divide(10, 3);
        System.out.println(divide);
    }
}