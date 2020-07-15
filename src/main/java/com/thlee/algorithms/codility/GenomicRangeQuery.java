package com.thlee.algorithms.codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        int m = P.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            String geneStr = S.substring(P[i], Q[i] + 1)
                .chars()
                .distinct()
                .collect(StringBuilder::new,
                    (sb, ch) -> sb.append((char)ch),
                    StringBuilder::append)
                .toString();

            result[i] = geneStr.contains("A") ? 1 :
                geneStr.contains("C") ? 2 :
                    geneStr.contains("G") ? 3 : 4;
        }

        return result;
    }

}
