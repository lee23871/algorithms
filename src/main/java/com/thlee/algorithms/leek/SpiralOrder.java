package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int count = 0;
        int direction = 1;
        int cycle = 0;

        while (count < m * n) {
            if (direction == 1) {
                while (i < n - cycle) {
                    result.add(matrix[j][i]);
                    i++;
                    count++;
                }
                i--;
                j++;
                direction = 2;
            } else if (direction == 2) {
                while (j < m - cycle) {
                    result.add(matrix[j][i]);
                    j++;
                    count++;
                }
                j--;
                i--;
                direction = 3;
            } else if (direction == 3) {
                while (i >= 0 + cycle) {
                    result.add(matrix[j][i]);
                    i--;
                    count++;
                }
                i++;
                j--;
                direction = 4;
            } else if (direction == 4) {
                while (j >= 1 + cycle) {
                    result.add(matrix[j][i]);
                    j--;
                    count++;
                }
                j++;
                i++;
                direction = 1;
                cycle++;
            }
        }
        return result;
    }
}
