package com.thlee.algorithms.codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        int[][] dnaMap = new int[4][S.length()];
        dnaMap[0][0] = S.charAt(0) == 'A' ? 1 : 0;
        dnaMap[1][0] = S.charAt(0) == 'C' ? 1 : 0;
        dnaMap[2][0] = S.charAt(0) == 'G' ? 1 : 0;
        dnaMap[3][0] = S.charAt(0) == 'T' ? 1 : 0;

        for (int i = 1; i < S.length(); i++) {
            dnaMap[0][i] = dnaMap[0][i - 1] + (S.charAt(i) == 'A' ? 1 : 0);
            dnaMap[1][i] = dnaMap[1][i - 1] + (S.charAt(i) == 'C' ? 1 : 0);
            dnaMap[2][i] = dnaMap[2][i - 1] + (S.charAt(i) == 'G' ? 1 : 0);
            dnaMap[3][i] = dnaMap[3][i - 1] + (S.charAt(i) == 'T' ? 1 : 0);
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int min = P[i];
            int max = Q[i];

            if (min == 0) {
                result[i] = dnaMap[0][max] > 0 ? 1 :
                    dnaMap[1][max] > 0 ? 2 :
                        dnaMap[2][max] > 0 ? 3 : 4;
            } else {
                result[i] = dnaMap[0][min - 1] != dnaMap[0][max] ? 1 :
                    dnaMap[1][min - 1] != dnaMap[1][max] ? 2 :
                        dnaMap[2][min - 1] != dnaMap[2][max] ? 3 : 4;
            }
        }
        return result;
    }

}
