package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), 0, candidates, 0, target);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> tempList,
        int tempSum, int[] candidates, int start, int target) {
        if (tempSum == target) {
            result.add(new ArrayList<>(tempList));
            return;
        } else if (tempSum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            tempList.add(candidates[i]);
            backtrack(result, tempList, tempSum + candidates[i], candidates, i + 1, target);
            tempList.remove(tempList.size() - 1);
        }
    }
}
