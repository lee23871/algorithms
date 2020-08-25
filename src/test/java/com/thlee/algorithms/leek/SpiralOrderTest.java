package com.thlee.algorithms.leek;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralOrderTest {

    @Test
    void spiralOrder() {
        SpiralOrder spiralOrder = new SpiralOrder();
        List<Integer> integers = spiralOrder.spiralOrder(new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        });
        System.out.println(integers.toString());
    }
}