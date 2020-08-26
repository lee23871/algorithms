package com.thlee.algorithms.leek;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int len = 1;
        int dupNum = nums[0];
        int dupCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (dupCount < 2 || dupNum != nums[i]) {
                nums[len] = nums[i];
                len++;
            }
            if (dupNum != nums[i]) {
                dupNum = nums[i];
                dupCount = 1;
            } else {
                dupCount++;
            }
        }
        return len;
    }
}
