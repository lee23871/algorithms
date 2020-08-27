package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {

    @Test
    void partition() {
//        ListNode six = new ListNode(2);
////        ListNode five = new ListNode(5, six);
////        ListNode four = new ListNode(2, five);
////        ListNode three = new ListNode(3, four);
////        ListNode two = new ListNode(4, three);
////        ListNode one = new ListNode(1, two);


        ListNode two = new ListNode(1);
        ListNode one = new ListNode(2, two);

        PartitionList partitionList = new PartitionList();
        partitionList.partition(one, 2);
    }
}