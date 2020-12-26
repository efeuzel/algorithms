package com.company;

public class Sorting {
    public static void BubbleSort(int[] input) { //0(n^2)
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp;
                    temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] input) { // O(n^2)
        for (int i = 0; i < input.length - 2; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int tmp = input[smallestIndex];
            input[smallestIndex] = input[i];
            input[i] = tmp;
        }
    }

    public static void InsertionSort(int[] input) { //O(n^2), good for
        //small lists and efficient for nearly sorted lists.
        for (int i = 1; i < input.length; i++) {
            int tmp = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > tmp) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = tmp;
        }
    }
}
