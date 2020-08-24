package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    @Test
    void threeSumClosest() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int i = threeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(i);
    }
}