package com.company.Main;

public class Node {
    // Node in the Singly Linked List.  Nodes store ints. Default data value is 0.
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // constructor, takes int
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}