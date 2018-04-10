package com.company.Tests;

import com.company.Main.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test
    public void node_successfullyGetsAndSetsData(){
        Node testNode = new Node(5);
        assertEquals(testNode.getData(), 5);
        testNode.setData(15);
        assertEquals(testNode.getData(),15);
    }

    @Test
    public void node_successfullyGetsAndSetsNext(){
        Node nodeA = new Node(5);
        Node nodeB = new Node(100);
        Node nodeC = new Node(777);
        Node nodeD = new Node(99);
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        assertEquals(nodeA.getNext(), nodeB);
        assertEquals(nodeB.getNext(), nodeC);
        assertEquals(nodeA.getNext().getNext(), nodeC);
        nodeB.setNext(nodeD);
        assertEquals(nodeB.getNext(), nodeD);

    }

}
