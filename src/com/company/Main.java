package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {5, 4, 3, 2, 1};
        Sorting.BubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));

        myArray = new int[] {7, 6, 5, 4, 3, 2, 1};
        Sorting.SelectionSort(myArray);
        System.out.println(Arrays.toString(myArray));

        myArray = new int[] {7, 2, 5, 4, 3, 2, 1};
        Sorting.InsertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
