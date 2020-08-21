package com.thlee.algorithms.leek;

public class RepeatedStrMath {

    public int repeatedStringMatch(String A, String B) {
        int aLength = A.length();
        String repeat = A;
        int count = 1;
        while(repeat.length() < B.length()) {
            repeat += A;
            count++;
        }

        while (!repeat.contains(B) && repeat.length() < B.length() + aLength * 2) {
            repeat += A;
            count++;
        }

        return repeat.contains(B) ? count : -1;

    }
}
