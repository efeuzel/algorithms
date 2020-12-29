package com.company;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void insertSorted(int data) {
        Node newNode = new Node(data);
        Node current = head;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else { //move to correct position or end of list
            if (head.data >= newNode.data) {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            } else {
                while (current != null && current.data <= newNode.data) {
                    current = current.next;
                }
                if (current != null) {
                    newNode.prev = current.prev;
                    newNode.next = current;

                    current.prev.next = newNode;
                    current.prev = newNode;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
            }
        }


    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ", ";
            current = current.next;
        }

        result += "}";
        return result;
    }


    public class Node {
        int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Data: " + data;
        }
    }
}


