package com.thlee.algorithms.others;

public class FindDigits {

    static int findDigits(int n) {
        String s = String.valueOf(n);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        return count;

    }
}
