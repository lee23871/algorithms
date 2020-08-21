package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripleSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<String> resultStr = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int counter = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            if ((nums[j] + nums[j + 1] > counter) ||
                (nums[k] + nums[k - 1] < counter)) {
                continue;
            }
            while (j < k) {
                if (nums[j] + nums[k] == counter) {
                    String tripletStr = String.format("%d%d%d", nums[i], nums[j], nums[k]);
                    if (!resultStr.contains(tripletStr)) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(triplet);
                        resultStr.add(tripletStr);
                    }
                    j++;
                    k--;
                } else if(nums[j] + nums[k] < counter) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
