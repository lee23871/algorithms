package com.thlee.algorithms.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kth {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();
        for (int[] command : commands) {
            result.add(getKth(array, command));
        }
        return result.stream().mapToInt(a -> a).toArray();
    }

    private int getKth(int[] array, int[] command) {
        int size = command[1] - command[0];
        List<Integer> list = new ArrayList<>(size);

        for (int i = command[0] - 1; i <= command[1] - 1; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);

        return list.get(command[2] - 1);
    }
}
