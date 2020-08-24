package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageRotateTest {

    @Test
    void rotate() {
        int[][] image = new int[][]{{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        ImageRotate imageRotate = new ImageRotate();
        imageRotate.rotate(image);
        System.out.println(image.toString());
    }
}
