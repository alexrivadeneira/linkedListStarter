package com.company.Tests;

import com.company.Main.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void linkedList_successfullyGetsSize(){
        LinkedList lltest = new LinkedList();
        assertEquals(lltest.getSize(), 0);
    }

    @Test
    public void linkedList_successfullyAddsNodeAndIncreasesSize(){
        LinkedList lltest = new LinkedList();
        lltest.addToTail(100);
        assertEquals(lltest.getSize(), 1);
        lltest.addToTail(200);
        assertEquals(lltest.getSize(), 2);

    }

    @Test
    public void linkedList_successfullyAddsNodeAndGetsCorrectLastNodeData(){
        LinkedList lltest = new LinkedList();
        assertEquals(lltest.getLastNodeData(), -1);
        lltest.addToTail(150);
        assertEquals(lltest.getLastNodeData(), 150);
        lltest.addToTail(777);
        assertEquals(lltest.getLastNodeData(), 777);
    }

    @Test
    public void linkedList_successfullyDeletesFirstNodeWithValueAndDecreasesSize(){
        LinkedList lltest = new LinkedList();

        lltest.addToTail(100);
        lltest.addToTail(500);
        lltest.addToTail(333);
        lltest.addToTail(200);
        assertEquals(lltest.getSize(), 4);

        lltest.deleteFirstNodeWithValue(333);
        assertEquals(lltest.getSize(), 3);

        lltest.addToTail(999);
        lltest.addToTail(10000);
        assertEquals(lltest.getSize(), 5);

        lltest.deleteFirstNodeWithValue(100);
        assertEquals(lltest.getSize(), 4);

        lltest.deleteFirstNodeWithValue(3);
        assertEquals(lltest.getSize(), 4);

    }

    @Test
    public void linkedList_successfullyDeletesFirstNodeWithValueGetsCorrectTailNode(){
        LinkedList lltest = new LinkedList();
        lltest.deleteFirstNodeWithValue(8888);
        assertEquals(lltest.getLastNodeData(), -1);

        lltest.addToTail(2222);
        lltest.addToTail(60);
        lltest.addToTail(555);
        lltest.deleteFirstNodeWithValue(60);
        assertEquals(lltest.getLastNodeData(), 555);

        lltest.addToTail(200);
        lltest.deleteFirstNodeWithValue(60);
        assertEquals(lltest.getLastNodeData(), 200);

    }
}

