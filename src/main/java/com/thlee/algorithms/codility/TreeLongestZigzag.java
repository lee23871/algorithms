package com.thlee.algorithms.codility;

public class TreeLongestZigzag {
    public int solution(Tree T) {
        // Implement your solution here
        if (T == null) {
            return 0;
        }

        int left = findZigzag(T.l, 0);
        int right = findZigzag(T.r, 1);

        return left > right ? left : right;
    }

    // direction: 0: left, 1: right
    public int findZigzag(Tree T, int direction) {
        if (T == null) {
            return 0;
        }

        int left = 0;
        if (T.l != null) {
            left = findZigzag(T.l, 0);
            if (direction == 1) {
                left++;
            }
        }
        int right = 0;
        if (T.r != null) {
            right = findZigzag(T.r, 1);
            if (direction == 0) {
                right++;
            }
        }

        return left > right ? left : right;
    }

    static class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
}
