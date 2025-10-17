package com.vromanyu.datastructures;

import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    public void testLinkedListCreationWithOneValue(){
        LinkedList<Integer> linkedList = new LinkedList<>(10);
        linkedList.printList();
        linkedList.printHead();
        linkedList.printTail();
        linkedList.printLength();
    }

    @Test
    public void testLinkedListCreationWithNoValues(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.printList();
        linkedList.printHead();
        linkedList.printTail();
        linkedList.printLength();
    }
}