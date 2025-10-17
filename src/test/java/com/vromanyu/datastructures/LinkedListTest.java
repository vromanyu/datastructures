package com.vromanyu.datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    public void testLinkedListCreationWithOneValue(){
        LinkedList<Integer> linkedList = new LinkedList<>(10);
        linkedList.printList();
        linkedList.printHead();
        linkedList.printTail();
        linkedList.printLength();

        Assertions.assertAll(() -> {
            Assertions.assertNotNull(linkedList);
            Assertions.assertNotNull(linkedList.getHead());
            Assertions.assertNotNull(linkedList.getTail());
            Assertions.assertEquals(10, linkedList.getHead().getValue());
            Assertions.assertEquals(10, linkedList.getTail().getValue());
        });
    }

    @Test
    public void testLinkedListCreationWithNoValues(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.printList();
        linkedList.printHead();
        linkedList.printTail();
        linkedList.printLength();

        Assertions.assertAll(() -> {
            Assertions.assertNotNull(linkedList);
            Assertions.assertNull(linkedList.getHead());
            Assertions.assertNull(linkedList.getTail());
            Assertions.assertEquals(0, linkedList.getLength());
        });
    }

    @Test
    public void testAppendToEmptyLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(10);

        Assertions.assertAll(() -> {
            Assertions.assertEquals(10, linkedList.getHead().getValue());
            Assertions.assertEquals(10, linkedList.getTail().getValue());
            Assertions.assertEquals(1, linkedList.getLength());
        });
    }

    @Test
    public void testAppendToNotEmptyLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        int value = 10;
        linkedList.append(value);

        Assertions.assertAll(() -> {
            Assertions.assertNotNull(linkedList.getHead());
            Assertions.assertNotNull(linkedList.getTail());
            Assertions.assertEquals(value, linkedList.getHead().getValue());
        });
    }
}