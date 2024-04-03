package com.thlee.algorithms.codility;

public class CountConfirmingBits {
    public static int solution(int A, int B, int C) {
        // Implement your solution here
        return getConfirmingCount(A) + getConfirmingCount(B) + getConfirmingCount(C)
            - getConfirmingCount(A | B) - getConfirmingCount(B | C) - getConfirmingCount(A | C)
            + getConfirmingCount(A | B | C);
    }

    private static int getConfirmingCount(int i) {
        int count = 0;
        while (i > 0) {
            if (i % 2 == 1) {
                count++;
            }
            i /= 2;
        }
        return (int)Math.pow(2, 30 - count);
    }
}
