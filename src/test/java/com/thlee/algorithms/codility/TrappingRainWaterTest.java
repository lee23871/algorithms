package com.thlee.algorithms.codility;

import org.junit.jupiter.api.Test;

import com.thlee.algorithms.codility.TrappingRainWater;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void trap() {
        int[] height = new int[] {3, 0, 2, 0, 4, 2};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(height);

        assertEquals(7, result);
    }
}
