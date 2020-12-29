package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixSumQuestion {
    //Solving interview question
    //before [[2,3][5,7]]
    //after [[2,5][7,17]]
    //find before given after

    public static void main(String[] args) {
        /*List<List<Integer>> after = new ArrayList<>();
        after.add(Arrays.asList(1,3,6));
        after.add(Arrays.asList(5,12,33));
        after.add(Arrays.asList(12,41,122));
        System.out.println("After: " + Arrays.toString(after.toArray()));*/

        List<List<Integer>> before = new ArrayList<>();
        before.add(Arrays.asList(1, 2, 3));
        before.add(Arrays.asList(4, 5, 6));
        before.add(Arrays.asList(7, 8, 9));
        System.out.println("Before: " + Arrays.toString(before.toArray()));

        int numRows = before.size();
        int numCols = before.get(0).size();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int newVal = 0; //before.get(i).get(j);
                for (int ii = 0; ii <= i; ii++) {
                    for (int jj = 0; jj <= j; jj++) {
                        newVal += before.get(ii).get(jj);
                    }
                }
                before.get(i).set(j, newVal);
            }
        }
        System.out.println("After: " + Arrays.toString(before.toArray()));

        afterToBefore(before);

    }

    public static void afterToBefore(List<List<Integer>> after) {

        int numRows = after.size();
        int numCols = after.get(0).size();
        for (int i = numRows - 1; i >= 0; i--) {
            for (int j = numCols - 1; j >= 0; j--) {
                int newVal = 0;
                if (i != 0 && j != 0) {
                    newVal = after.get(i).get(j)
                            - after.get(i - 1).get(j)
                            - after.get(i).get(j - 1)
                            - after.get(i - 1).get(j - 1);
                }
                if (i == 0 && j != 0) {
                    newVal = after.get(i).get(j)
                            - after.get(i).get(j - 1);
                }
                if (i != 0 && j == 0) {
                    newVal = after.get(i).get(j)
                            - after.get(i - 1).get(j);
                }
                if (i == 0 && j == 0) {
                    newVal = after.get(i).get(j);
                }
                after.get(i).set(j, newVal);
            }
        }
        System.out.println("Before: " + Arrays.toString(after.toArray()));
    }

}
