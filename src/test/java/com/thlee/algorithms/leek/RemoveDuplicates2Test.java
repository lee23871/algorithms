package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicates2Test {

    @Test
    void removeDuplicates() {
        RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();
        removeDuplicates2.removeDuplicates(new int[] {1,1,1,2,2,3});
    }
}