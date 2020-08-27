package com.thlee.algorithms.leek;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode leftStart = null;
        ListNode leftEnd = null;
        ListNode rightStart = null;
        ListNode rightEnd = null;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val < x) {
                if (leftStart == null) {
                    leftStart = cur;
                    leftEnd = leftStart;
                    cur = cur.next;
                    leftEnd.next = rightStart;
                } else {
                    leftEnd.next = cur;
                    cur = cur.next;
                    leftEnd = leftEnd.next;
                    leftEnd.next = rightStart;
                }
            } else {
                if (rightStart == null) {
                    rightStart = cur;
                    rightEnd = cur;
                    if (leftEnd != null) {
                        leftEnd.next = rightStart;
                    }
                    cur = cur.next;
                    rightEnd.next = null;
                } else {
                    rightEnd.next = cur;
                    rightEnd = rightEnd.next;
                    cur = cur.next;
                    rightEnd.next = null;
                }
            }
        }
        return leftStart != null ? leftStart : rightStart;
    }
}
