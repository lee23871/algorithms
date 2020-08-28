package com.thlee.algorithms.leek;

public class ReverseLinkedList {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }

        ListNode before = m == 1 ? null : head;

        for (int i = 1; i < m - 1; i++) {
            before = before.next;
        }

        ListNode mStart = before == null ? head : before.next;
        ListNode cur = mStart.next;
        ListNode next = cur.next;
        ListNode prev = mStart;
        for (int i = 0; i < n - m; i++) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        mStart.next = cur;
        if (m == 1) {
            return prev;
        } else {
            before.next = prev;

            return head;
        }

    }
}
