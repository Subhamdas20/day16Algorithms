package com.bridgelabz.algorithms.collection;


class Node<T> {
    T data;
    Node<T> next;
}

public class LinkedList<T> {
    /**
     * created linkedlist implementation
     */
    Node<T> head;
    Node<T> tail;

    /**
     * append is used to append data to stack
     *
     * @param data is used to take input for append
     */
    public void append(T data) {
        Node<T> newNode = new Node<T>();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        }
        if (tail == null) {
            tail = newNode;
        } else {
            Node<T> tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
        }
    }

    /**
     * push is used to push data to stack
     *
     * @param data is used for taking input
     */
    public void push(T data) {
        Node<T> newNode = new Node<T>();
        newNode.data = data;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertAtFirst(String data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtAnyLocation(int index, String data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        if (index == 0) {
            insertAtFirst(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }

    }

    public void delete(int index) {
        Node n = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node y = n.next;
            n.next = y.next;
        }
    }

    public T pop() {
        Node<T> temp = head;
        head = head.next;
        return temp.data;
    }

    public void show() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
