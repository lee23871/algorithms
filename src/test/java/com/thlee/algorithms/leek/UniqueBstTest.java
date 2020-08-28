package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBstTest {

    @Test
    void generateTrees() {
        UniqueBst uniqueBst = new UniqueBst();
        uniqueBst.generateTrees(3);
        System.out.println(uniqueBst);
    }
}