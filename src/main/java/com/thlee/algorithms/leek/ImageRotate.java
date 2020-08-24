package com.thlee.algorithms.leek;

public class ImageRotate {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int half = n / 2 + ((n % 2 == 1) ? 1 : 0);

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < n / 2; j++) {
                int x = i;
                int y = j;
                int temp = matrix[x][y];
                for (int k = 0; k < 4; k++) {
                    int nextY = n - x - 1;
                    int temp2 =  matrix[y][nextY];
                    matrix[y][nextY] = temp;
                    temp = temp2;
                    x = y;
                    y = nextY;
                }
            }
        }
    }
}
