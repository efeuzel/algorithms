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

        myArray = new int[] {7};
        int pos = Searching.binarySearch(myArray, 7);
        System.out.println(pos);

        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);
        System.out.println(list.toString());
        System.out.println("list length is " + list.length());
        list.deleteHeadNode();
        System.out.println(list.toString());
        System.out.println("list length is " + list.length());
        System.out.println("Found " + list.find(12));
        System.out.println("Found " + list.find(15));

    }
}
