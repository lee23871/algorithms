package com.thlee.algorithms.leek;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void minimumTotal() {
        List<List<Integer>> list = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );
        Triangle triangle = new Triangle();
        int i = triangle.minimumTotal(list);
        System.out.println(i);
    }
}