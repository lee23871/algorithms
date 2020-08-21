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

            if (i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            while (j < k) {
                if (nums[j] + nums[k] == counter) {

                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(triplet);
                    do {
                        j++;
                    } while(j < k && nums[j] == nums[j - 1]);
                    do {
                        k--;
                    } while(j < k && nums[k] == nums[k + 1]);
                } else if(nums[j] + nums[k] < counter) {
                    do {
                        j++;
                    } while(j < k && nums[j] == nums[j - 1]);
                } else {
                    do {
                        k--;
                    } while(j < k && nums[k] == nums[k + 1]);
                }
            }
        }
        return result;
    }
}
