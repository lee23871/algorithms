package com.thlee.algorithms.codility;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {
        int count = 0;

        Stack<Integer> stack = new Stack<>();
        for (int h : H) {
            while (!stack.empty() && h < stack.peek()) {
                stack.pop();
            }

            if (stack.empty()) {
                stack.push(h);
                count++;
            } else {
                if (h > stack.peek()) {
                    stack.push(h);
                    count++;
                }
            }
        }

        return count;
    }

}
