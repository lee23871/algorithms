package com.thlee.algorithms.sorting;

public class QuickSortLinkedList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode end = head;
        while (end.next != null) {
            end = end.next;
        }

        quickSort(head, end);
        return head;
    }

    public void quickSort(ListNode start, ListNode end) {

        if (start == end) {
            return;
        }

        ListNode pivot = partition(start, end);

        if (start != pivot) {
            ListNode left = start;
            while (left.next != pivot) {
                left = left.next;
            }
            quickSort(start, left);
        }
        if (pivot != end && pivot.next != end) {
            quickSort(pivot.next, end);
        }
    }

    public ListNode partition(ListNode start, ListNode end) {
        int val = end.val;
        ListNode left = start;

        while (start != end) {
            if (start.val < val) {
                int temp = left.val;
                left.val = start.val;
                start.val = temp;
                left = left.next;
            }
            start = start.next;
        }
        end.val = left.val;
        left.val = val;
        return left;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
