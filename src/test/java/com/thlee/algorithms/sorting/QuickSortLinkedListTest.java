package com.thlee.algorithms.sorting;

import org.junit.jupiter.api.Test;

import com.thlee.algorithms.sorting.QuickSortLinkedList.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortLinkedListTest {

    @Test
    void sortList() {
        ListNode five = new ListNode(0);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(5, three);
        ListNode one = new ListNode(-1, two);

        QuickSortLinkedList quickSortLinkedList = new QuickSortLinkedList();
        quickSortLinkedList.sortList(one);
        System.out.println(one);

    }
}