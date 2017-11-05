package com.company.Stack;

import com.company.LinkList.Node;

/**
 * Created by seyha on 11/1/17.
 */
public class StackLinkList<T> {

    Node top;

    public StackLinkList() {
        top = null;
    }

    public void push(Object value) {
        Node newItem = new Node(value, null);

        if(top == null) {
            top = newItem;
        } else {
            newItem.next = top;
            top = newItem;
        }
    }

    public T pop() {

        if(top == null){

            System.out.println("The stack is empty!");
            return null;
        }

        T value = (T) top.value;

        top = top.next;

        return value;
    }

//    public void display() {
//
//        Node n = top;
//
//        while (n != null) {
//
//            System.out.println("Node " + n.value);
//
//            n = n.next;
//        }
//    }

}
