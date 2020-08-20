package com.thlee.algorithms.sorting;

public class QuickSort {

    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(a, low, high);

        quickSort(a, low, pivot - 1);
        quickSort(a, pivot + 1, high);
    }

    public static int partition(int[]  a, int low, int high) {
        int pivot = a[high];

        for (int i = low; i < high - 1; i++) {
            if (a[i] < pivot) {
                int temp = a[i];
                a[i] = a[low];
                a[low] = temp;
                low++;
            }
        }
        int temp = a[high];
        a[high] = a[low];
        a[low] = temp;

        return low;
    }
}
