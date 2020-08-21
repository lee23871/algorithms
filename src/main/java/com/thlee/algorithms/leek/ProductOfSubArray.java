package com.thlee.algorithms.leek;

public class ProductOfSubArray {
    static long product(int arr[])
    {
        long product = 1;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int count = (i + 1) * (n - i);
            product *= Math.pow(arr[i], count);
        }

        return product;
    }
}
