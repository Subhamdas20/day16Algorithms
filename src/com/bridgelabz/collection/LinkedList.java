package com.bridgelabz.collection;


class Node<T> {
    T data;
    Node<T> next;
}

public class LinkedList<T extends Comparable> {
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
    /**
     * sortList is used to sort the list
     * */

    public void sortList(){
        Node<T> current = head, index = null;
        T temp;
        if(head == null){
            return;
        }
        else {
            while (current!=null){
                index = current.next;
                while (index != null){
                    if(current.data.compareTo(index.data)>0){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }

    }




    public void insertAtFirst(String data){
        Node node = new Node();
        node.data = data;
        node.next=head;
        head = node;
    }
    public void insertAtAnyLocation(int index , String data){
        Node node = new Node();
        node.data = data;
        node.next=null;
        Node n = head;
        if(index==0){
            insertAtFirst( data);
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }

    }
    public void delete(int index){
      Node n = head;
      if (index==0){
          head=head.next;
      }
      else {
          for (int i = 0; i < index - 1; i++) {
              n = n.next;
          }
          Node y = n.next;
          n.next = y.next;
      }
    }
    /**
     * to search if element present in list
     * @param data is the input from used
     * */
public boolean search(T data){
    Node<T> current = head, index = null;
    T temp;
    if(head == null){
        return false;
    }
    else {
        while (current!=null){
            index = current.next;
            while (index != null){
                if(current.data.equals(data)){
                   return true;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
    return false;
    }
    public void deleteElement(T data) {
        if (head.data == data) {
            pop();
            return;
        } else {
            Node<T> tempNode = this.head;
            Node temp2 = null;
            while (!tempNode.data.equals(data)) {
                temp2 = tempNode;
                tempNode = tempNode.next;
            }
            Node temp = tempNode.next;
            temp2.next = temp;

        }
    }

/*
* used to delete the head node
* */
    public T pop() {
        Node<T> temp = head;
        head = head.next;
        return temp.data;
    }
/*
* show is used to print the list
* */
    public T show() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
           return node.data;
    }

}
