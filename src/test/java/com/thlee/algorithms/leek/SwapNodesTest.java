package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import com.thlee.algorithms.leek.SwapNodes.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesTest {

    @Test
    void swapPairs() {
        // given
        ListNode four = new ListNode(4);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);
        SwapNodes swapNodes = new SwapNodes();

        // when
        ListNode result = swapNodes.swapPairs(one);

        // then
        System.out.println(result);
    }
}