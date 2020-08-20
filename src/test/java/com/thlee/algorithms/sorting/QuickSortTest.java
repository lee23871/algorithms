package com.thlee.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        // given
        int[] a = new int[] {3, 1, 5, 2, 6, 2};

        // when
        QuickSort.sort(a);

        // then
        for (int i = 0; i < a.length - 1; i++) {
            assertTrue(a[i] <= a[i + 1]);
        }
    }
}
