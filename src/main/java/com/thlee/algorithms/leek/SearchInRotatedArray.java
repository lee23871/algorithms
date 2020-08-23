package com.thlee.algorithms.leek;

public class SearchInRotatedArray {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (((nums[start] > nums[mid]) &&
                (target >= nums[start] || target < nums[mid])) ||
                ((nums[start] < nums[mid]) &&
                    (target >= nums[start] && target < nums[mid]))
            ) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
