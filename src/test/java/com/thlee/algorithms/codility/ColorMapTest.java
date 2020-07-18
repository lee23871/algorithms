package com.thlee.algorithms.codility;

import java.awt.image.ColorConvertOp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorMapTest {

    @Test
    void solution() {
        ColorMap colorMap = new ColorMap();

        int result = colorMap.solution(
            new int[][]{{5, 4, 4}, {4, 3, 4}, {3, 2, 4},
                {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}});

    }
}