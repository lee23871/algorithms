package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitionTest {

    @Test
    void partition() {
        PalindromePartition palindromePartition = new PalindromePartition();
        palindromePartition.partition("cbbbcc");
    }
}