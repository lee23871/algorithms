package com.thlee.algorithms.leek;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.thlee.algorithms.leek.AddTwoNumbers.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void addTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        // Arrange
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        // Act
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // Assert
        assertEquals(expected.val, result.val);
        assertEquals(expected.next.val, result.next.val);
        assertEquals(expected.next.next.val, result.next.next.val);
    }

    private static Stream<Arguments> arguments() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        ListNode temp1 = l1.next;
        temp1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        ListNode temp2 = l2.next;
        temp2.next = new ListNode(4);

        ListNode e = new ListNode(7);
        e.next = new ListNode(0);
        ListNode tempE = e.next;
        tempE.next = new ListNode(8);

        return Stream.of(
            Arguments.of(l1, l2, e)
        );
    }
}