package com.thlee.algorithms.leek;

public class AddTwoNumbers {

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode result = new ListNode(sum % 10);
        int overflow = sum / 10;

        ListNode currentL1 = l1.next;
        ListNode currentL2 = l2.next;
        ListNode nextResult = result;

        while (currentL1 != null || currentL2 != null) {
            sum = overflow;
            if (currentL1 != null) {
                sum += currentL1.val;
                currentL1 = currentL1.next;
            }
            if (currentL2 != null) {
                sum += currentL2.val;
                currentL2 = currentL2.next;
            }

            overflow = sum / 10;
            nextResult.next = new ListNode(sum % 10);
            nextResult = nextResult.next;
        }

        if (overflow > 0) {
            nextResult.next = new ListNode(overflow);
        }

        return result;
    }
}
