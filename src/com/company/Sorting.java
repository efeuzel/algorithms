package com.company;

import java.util.Arrays;

public class Sorting {
    public static void BubbleSort(int[] input) {
        for(int i = 0; i < input.length -1; i++) {
            for(int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j+1]) {
                    int temp;
                    temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
