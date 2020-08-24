package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MulStringTest {

    @Test
    void multiply() {
        MulString mulString = new MulString();
        String multiply = mulString.multiply2("140", "721");
        System.out.println(multiply);
    }
}