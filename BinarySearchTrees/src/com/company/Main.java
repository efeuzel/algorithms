package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 10, 73, 5, 38, 72, 50, 87, 3, 15};

        BinarySearchTree tree = new BinarySearchTree();
        for (int i : a) {
            tree.insert(i);
        }

        System.out.println(tree.smallest());
        System.out.println(tree.largest());

        tree.traverseInOrder();

    }
}
