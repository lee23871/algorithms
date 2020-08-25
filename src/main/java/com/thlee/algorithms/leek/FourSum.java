package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 0, nums, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int sum,
        int[] nums, int target, int start) {
        if (temp.size() == 4 && sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (temp.size() >= 4) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(result, temp, sum + nums[i], nums, target, i + 1);
            temp.remove(temp.size() - 1);
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }
}
