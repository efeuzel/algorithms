package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {12, 9, 7, 15, 10, 1};
        //QuickSort.partition(a,0,a.length-1);
        QuickSort.quickSort(a,0,a.length-1);
        System.out.println("Sorted array is " + Arrays.toString(a));
    }
}
