package com.company;

public class Searching {
    //worst case is O(n) for unsorted arrays
    //worst case is O(log(n)) for binary search on sorted arrays
    //insert and delete are O(n)

    //Java uses generics to sort any kind of objects

    public static int binarySearch(int[] sortedArray, int value) {
        int start = 0;
        int end = sortedArray.length;
        int mid;
        while (end > start) {
            mid = (start + end) / 2;
            if(sortedArray[mid] == value) return mid;

            if(value > sortedArray[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
