package com.thlee.algorithms.codility;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        List<Integer> peakList = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peakList.add(i);
            }
        }

        if (peakList.size() < 2) {
            return peakList.size();
        }

        int start = 1;
        int end = peakList.size();
        int result = 0;

        while (start <= end) {
            int flag = (start + end) / 2;
            int flagCount = 1;
            int dist = peakList.get(0);
            for (int i = 1; i < peakList.size(); i++) {
                if (peakList.get(i) - dist >= flag) {
                    flagCount++;
                    dist = peakList.get(i);

                    if (flagCount >= flag) {
                        break;
                    }
                }
            }

            if (flagCount >= flag) {
                result = flag;
                start = flag + 1;
            } else {
                end = flag - 1;
            }
        }

        return result;
    }
}
