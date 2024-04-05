package com.thlee.algorithms.codility;

public class CountingCountries {
    // Flood fill O(n*m)
    private int count;

    public int solution(int[][] A) {
        // Implement your solution here
        int n = A.length;
        int m = A[0].length;
        int[][] floodMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (floodMap[i][j] != 1) {
                    count++;
                    floodFill(A, floodMap, A[i][j], i, j);
                }
            }
        }
        return count;
    }

    private void floodFill(int[][] A, int[][] floodMap, int color, int x, int y) {
        if (x < 0 || x >= A.length ||
            y < 0 || y >= A[0].length ||
            floodMap[x][y] == 1 ||
            A[x][y] != color) {
            return;
        }

        floodMap[x][y] = 1;

        floodFill(A, floodMap, color, x + 1, y);
        floodFill(A, floodMap, color, x - 1, y);
        floodFill(A, floodMap, color, x, y - 1);
        floodFill(A, floodMap, color, x, y + 1);
    }
}
