package com.bridgelabz.collection;

public class Queue<T> {
    LinkedList list;
    public Queue() {
        this.list = new LinkedList();
    }

    public void append(T data) {
        list.append((Comparable) data);

    }

    public T dequeue() {
        return (T) list.pop();
    }

    public void printQueue() {
        list.show();
    }

}
