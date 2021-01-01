package com.company;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] a, int start, int end) {
        //System.out.println("Before partition " + Arrays.toString(a));
        int pivot = a[end];
        int i = start;
        for (int j = i; j < end; j++) {
            if (a[j] <= pivot) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;
            }
        }
        int tmp = a[end];
        a[end] = a[i];
        a[i] = tmp;
        //System.out.println("After partition " + Arrays.toString(a));
        return i;
    }

    public static void quickSort(int[] a, int start, int end) {
        if(start < end) {
            int pivot = partition(a, start, end);
            quickSort(a, start, pivot -1);
            quickSort(a, pivot + 1, end);
        }
    }
}
