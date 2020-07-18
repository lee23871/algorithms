package com.thlee.algorithms.codility;

public class ColorMap {

    public int solution(int[][] A) {
        // Assumed A contains at least one row and column, not validating the assumtion
        int count = 0;
        int prevColor = 0;

        // process the first row in order to check if it's the first row everytime later
        for (int j = 0; j < A[0].length; j++) {
            if (j == 0 || A[0][j] != prevColor) {
                prevColor = A[0][j];
                count++;
            }
        }

        for (int i = 1; i < A.length; i++) {
            boolean isNew = false;
            for (int j = 0; j < A[i].length; j++) {
                if (j == 0) {
                    if (A[i - 1][j] != A[i][j]) { // new country
                        count++;
                        isNew = true;
                    }
                } else {
                    if (A[i][j] != prevColor && A[i - 1][j] != A[i][j]) { // new country
                        count++;
                        isNew = true;
                    } else if (A[i - 1][j] == A[i][j] && A[i][j - 1] == A[i][j]) {
                        if (isNew) {
                            count--; // subtract the country we thought it was new country, in fact it was not
                            isNew = false;
                        }
                    } else {
                        isNew = false;
                    }
                }
                prevColor = A[i][j];
            }
        }

        return count;
    }
}
