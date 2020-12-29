package com.company;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void deleteHeadNode() {
        head = head.getNextNode();
    }

    public void insertInPlaceSorted(Node n){
        Node current = head;
        while (current.getNextNode().getData() < n.getData()) {
            current = current.getNextNode();
        }
        //next node's data is bigger now
        n.setNextNode(current.getNextNode());
        current.setNextNode(n);
    }

    public Node find(int value) {
        Node current = head;
        while (current != null) {
            if(current.getData() == value) return current;
            current = current.getNextNode();
        }
        return null;
    }

    public int length(){
        int length = 0;
        Node current = head;

        while (current != null) {
            length ++;
            current = current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }

        result += "}";
        return result;
    }

}
