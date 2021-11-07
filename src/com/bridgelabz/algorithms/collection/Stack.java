package com.bridgelabz.algorithms.collection;

public class Stack<T> {
    LinkedList list;

    /*
     * to create object of linkedList
     * */
    public Stack() {
        this.list = new LinkedList();
    }

    /**
     * push method is used to push data to stack
     * @param data is used to take input
     */
    public void push(T data) {
        list.push(data);

    }

    /*
     * used to check the head
     * */
    public T peak() {
        return (T) list.head.data;
    }


    /*
     * pop is used to delete nodes
     * */

    public T pop() {
        return (T) list.pop();
    }
    /*
     * Used to check if queue is empty or not
     * */

    public boolean isEmpty() {
        return list.head == null;
    }
    /*
     * print stack
     * */


    public void printStack() {
        list.show();
    }
}