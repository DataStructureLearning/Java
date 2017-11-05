package com.company.Queue;


import com.company.LinkList.Node;

/**
 * Created by seyha on 11/3/17.
 */


public class QueueLinkList<T> {

    Node head;

    public QueueLinkList() {
        head = null;
    }

    public void push(Object value) {
        Node newItem = new Node(value, null);

        if(head == null) {
            head = newItem;
        } else {
            head.next = newItem;

        }
    }

    public T pop() {

        if(head == null){

            System.out.println("The stack is empty!");
            return null;
        }

        T value = (T) head.value;

        head = head.next;

        return value;
    }
}
