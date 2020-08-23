package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

class SearchInRotatedArrayTest {

    @Test
    void search() {
        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int search = searchInRotatedArray.search(arr, target);
        System.out.println(search);
    }
}
