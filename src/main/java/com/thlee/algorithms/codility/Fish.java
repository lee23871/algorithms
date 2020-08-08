package com.thlee.algorithms.codility;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> downstreamFishes = new Stack<Integer>();
        int fishEaten = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                downstreamFishes.push(A[i]);
            } else {
                if (downstreamFishes.size() > 0) {
                    while (!downstreamFishes.isEmpty() && A[i] > downstreamFishes.peek()) {
                        downstreamFishes.pop();
                        fishEaten++;
                    }
                    if (!downstreamFishes.isEmpty() && A[i] < downstreamFishes.peek()) {
                        fishEaten++;
                    }
                }
            }
        }
        return A.length - fishEaten;
    }
}
