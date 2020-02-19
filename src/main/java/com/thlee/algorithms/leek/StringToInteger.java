package com.thlee.algorithms.leek;

public class StringToInteger {

    public int myAtoi(String str) {
        int pos = 0;
        boolean isPositive = true;

        for (; pos < str.length(); pos++) {
            char ch = str.charAt(pos);

            if (ch >= '0' && ch <= '9') {
                break;
            }

            if (ch == ' ') {
                continue;
            } else if (ch == '-') {
                pos++;
                isPositive = false;
                break;
            } else if (ch == '+') {
                pos++;
                break;
            } else {
                return 0;
            }
        }

        if (pos >= str.length()) {
            return 0;
        }

        int result = 0;
        while (pos < str.length()) {
            char ch = str.charAt(pos);
            if (ch < '0' || ch > '9') {
                break;
            }

            int prev = result;
            result = 10 * result + ch - '0';

            if (result / 10 < prev) {
                if (isPositive) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            pos++;
        }

        if (isPositive) {
            return result;
        } else {
            return result * -1;
        }
    }
}
