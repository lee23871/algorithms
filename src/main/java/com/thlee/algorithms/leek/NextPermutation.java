package com.thlee.algorithms.leek;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        // 1. find descending K
        // 2. find largest l such that nums[l] > nums[k] and l > k
        // 3. swap nums[k] and nums[l]
        // 4. reverse k + 1 : end

        if (nums == null || nums.length < 2) {
            return;
        }

        int k = nums.length - 2;
        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }

        if (k >= 0) {
            int l = nums.length - 1;
            while (l > k && nums[l] <= nums[k]) {
                l--;
            }

            swap(nums, k, l);
        }

        k++;
        int end = nums.length - 1;
        while (k < end) {
            swap(nums, k++, end--);
        }

    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
