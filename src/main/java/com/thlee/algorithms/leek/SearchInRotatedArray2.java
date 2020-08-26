package com.thlee.algorithms.leek;

public class SearchInRotatedArray2 {

    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target || nums[start] == target || nums[end] == target) {
                return true;
            }

            if (((nums[start] > nums[mid]) &&
                (target >= nums[start] || target < nums[mid])) ||
                ((nums[start] < nums[mid]) &&
                    (target >= nums[start] && target < nums[mid]))
            ) {
                end = mid - 1;
            } else if (((nums[mid] > nums[end]) &&
                (target >= nums[mid] || target < nums[end])) ||
                ((nums[mid] < nums[end]) &&
                    (target >= nums[mid] && target < nums[end]))
            ) {
                start = mid + 1;
            } else {
                start++;
                end--;
            }
        }
        return false;
    }
}
