package com.company.Main;

public class LinkedList {
    // Singly Linked List

    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addToTail(int data){
        Node newNode = new Node(data);
        Node pointer = head;

        if(pointer == null){
            head = newNode;
            size++;
            return;
        }
        while(pointer.getNext() != null){
            pointer = pointer.getNext();
        }
        pointer.setNext(newNode);
        size++;
    }

    public int getLastNodeData(){

        if(head == null){
            return -1;
        }

        Node pointer = head;

        while(pointer.getNext() != null){
            pointer = pointer.getNext();
        }
        return pointer.getData();
    }

    public void deleteFirstNodeWithValue(int data){
        if(head == null){
            return;
        }

        if(head.getData() == data){
            head = head.getNext();
            size--;
            return;
        }

        Node pointer = head.getNext();
        Node prev = head;

        while(pointer.getNext() != null){
            if(pointer.getData() == data){
                prev.setNext(pointer.getNext());
                size--;
                return;
            }
            prev = pointer.getNext();
            pointer = pointer.getNext();
        }
    }

}

