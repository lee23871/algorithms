package com.thlee.algorithms.leek;

public class SwapNodes {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = head.next;
        ListNode current = head;
        ListNode prev = null;
        while (current != null && current.next != null) {
            ListNode next = current.next;

            current.next = next.next;
            next.next = current;
            if (prev != null) {
                prev.next = next;
            }
            prev = current;
            current = current.next;
        }

        return result;
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
