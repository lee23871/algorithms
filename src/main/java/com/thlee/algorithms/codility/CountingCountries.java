package com.thlee.algorithms.codility;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CountingCountries {
    // Flood fill O(n*m)
    public int solution(int[][] A) {
        // Implement your solution here
        int count = 0;
        int n = A.length;
        int m = A[0].length;
        int[][] floodMap = new int[n][m];
        Stack<List<Integer>> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int countrySize = 0;
                if (floodMap[i][j] != 1) {
                    count++;
                    stack.push(Arrays.asList(A[i][j], i, j));
                }

                while(!stack.isEmpty()) {
                    List<Integer> next = stack.pop();
                    if (skip(A, floodMap, next.get(0), next.get(1), next.get(2))) {
                        continue;
                    }

                    countrySize++;
                    floodMap[next.get(1)][next.get(2)] = 1;
                    stack.push(Arrays.asList(next.get(0), next.get(1) - 1, next.get(2)));
                    stack.push(Arrays.asList(next.get(0), next.get(1), next.get(2) - 1));
                    stack.push(Arrays.asList(next.get(0), next.get(1) + 1, next.get(2)));
                    stack.push(Arrays.asList(next.get(0), next.get(1), next.get(2) + 1));
                }
                System.out.println(countrySize);
            }
        }
        return count;
    }

    private boolean skip(int[][] A, int[][] floodMap, int color, int x, int y) {
        if (x < 0 || x >= A.length ||
            y < 0 || y >= A[0].length ||
            floodMap[x][y] == 1 ||
            A[x][y] != color) {
            return true;
        }
        return false;
    }
}
