package com.vromanyu.datastructures;

import java.util.Objects;

/**
 * Implementation of a generic LinkedList
 * @author vromanyu
 * @version 1.0
 */
public class LinkedList <T extends Number> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public LinkedList(T value){
        Node<T> node = new Node<>(value);
        head = node;
        tail = node;
        length = 1;
    }

    private static class Node <T extends Number> {

        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Node<?> node)) return false;
            return Objects.equals(getValue(), node.getValue());
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
