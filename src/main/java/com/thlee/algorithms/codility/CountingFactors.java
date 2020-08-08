package com.thlee.algorithms.codility;

public class CountingFactors {

    public int solution(int N) {
        int sqrt = (int) Math.floor(Math.sqrt(N));
        int count = 0;

        for (int i = 1; i <= sqrt; i++) {
            if (i * i == N) {
                count++;
            } else if (N % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}
