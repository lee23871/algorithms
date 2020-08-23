package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 0, candidates, 0, target);
        return result;
    }

    private void backtrack(List<List<Integer>> result,
        List<Integer> tempList, int tempSum,
        int[] candidates, int start, int target) {

        if (tempSum == target) {
            result.add(new ArrayList<>(tempList));
            return;
        } else if (tempSum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backtrack(result, tempList, tempSum + candidates[i], candidates, i, target);
            tempList.remove(tempList.size() - 1);
        }
    }
}
