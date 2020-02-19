package com.thlee.algorithms.leek;

public class RomanToInt {

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean isNextPair = isNextPair(s, i);
            if (isNextPair) {
                result += romanToInt(s.substring(i, i + 2), 0);
                i += 1;
            } else {
                int length = getSameCharPos(s, i);
                result += romanToInt(s.substring(i, i + 1), length);
                i += length - 1;
            }
        }

        return result;
    }

    private boolean isNextPair(String s, int pos) {
        if (pos + 1 >= s.length()) {
            return false;
        }

        char ch = s.charAt(pos);
        char nextCh = s.charAt(pos + 1);

        return (ch == 'C' && nextCh == 'D') || (ch == 'C' && nextCh == 'M') ||
            (ch == 'X' && nextCh == 'L') || (ch == 'X' && nextCh == 'C') ||
            (ch == 'I' && nextCh == 'V') || (ch == 'I' && nextCh == 'X');
    }

    private int getSameCharPos(String s, int pos) {
        int start = pos;
        char ch = s.charAt(pos);
        while (pos < s.length() && ch == s.charAt(pos)) {
            pos++;
        }
        return pos - start;
    }

    private int romanToInt(String s, int length) {
        if (s.equals("M")) {
            return 1000 * length;
        } else if (s.equals("CM")) {
            return 900;
        } else if (s.equals("D")) {
            return 500;
        } else if (s.equals("CD")) {
            return 400;
        } else if (s.equals("C")) {
            return 100 * length;
        } else if (s.equals("XC")) {
            return 90;
        } else if (s.equals("L")) {
            return 50;
        } else if (s.equals("XL")) {
            return 40;
        } else if (s.equals("X")) {
            return 10 * length;
        } else if (s.equals("IX")) {
            return 9;
        } else if (s.equals("V")) {
            return 5;
        } else if (s.equals("IV")) {
            return 4;
        } else if (s.equals("I")) {
            return length;
        }
        return 0;
    }
}
