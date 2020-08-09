package com.thlee.algorithms.codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EquiLeader {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack<Integer> leaderCandidates = new Stack<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int a : A) {
            countMap.put(a, countMap.getOrDefault(a, 0) + 1);
            if (leaderCandidates.isEmpty()) {
                leaderCandidates.push(a);
            } else {
                if (leaderCandidates.peek() == a) {
                    leaderCandidates.push(a);
                } else {
                    leaderCandidates.pop();
                }
            }
        }

        if (leaderCandidates.isEmpty() || countMap.get(leaderCandidates.peek()) < A.length / 2 + 1) {
            return 0;
        }
        int leader = leaderCandidates.peek();
        int leaderCount = countMap.get(leaderCandidates.peek());
        int count = 0;
        int leftCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                leftCount++;
            }

            if (leftCount > ((i + 1) / 2) && (leaderCount - leftCount) > (A.length - i - 1) / 2) {
                count++;
            }
        }

        return count;
    }
}
