package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 36;
        int b = 24;
        int c = 10;

        System.out.println("Greatest common divisor between " + a + " and " + b + " is " + euclid(a, b));
        System.out.println(c + "! is " + factorial(c));
        hanoiMove(3, 'A', 'C', 'B');

        int[] actual = { 5, 1, 6, 2, 3, 4 };
        mergeSort(actual, actual.length);
        System.out.println(Arrays.toString(actual));
    }

    public static int euclid(int a, int b) {
        if (b == 0) return a; // base condition - must have
        return euclid(b, a % b);
    }

    public static int factorial(int i) {
        if (i > 1) return i * factorial(i - 1);
        else return 1; // base condition
    }

    public static void hanoiMove(int n, char initialTower, char targetTower, char intermediateTower) {
        if (n > 0) {
            hanoiMove(n - 1, initialTower, intermediateTower, targetTower);
            System.out.println("Moving " + (n) + " from " + initialTower + " to " + targetTower
                    + " via " + intermediateTower);
            hanoiMove(n - 1, intermediateTower, targetTower, initialTower);
        }
    }

    // Tail recursion
    public int factorial2(int n, int result) { // result parameter is called accumulator
        if (n == 0) return result;
        return factorial2(n - 1, n * result);
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
