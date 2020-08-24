package com.thlee.algorithms.leek;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        int absDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int counter = target - nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (Math.abs(counter - nums[j] - nums[k]) < absDiff) {
                    result = nums[i] + nums[j] + nums[k];
                    absDiff = Math.abs(counter - nums[j] - nums[k]);
                }
                if (nums[j] + nums[k] < counter) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
