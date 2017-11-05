package com.company.LinkList;

/**
 * Created by seyha on 11/3/17.
 */
public class DoubleLinkList<T> {

    NodeD head;

    public DoubleLinkList() {
        head = null;
    }

    public void add(Object value) {

        NodeD newItem = new NodeD(value, null, null);

        if(head == null) {
            head = newItem;
        } else {
            newItem.next = head;
            head.prev = newItem;
            head = newItem;
        }
    }

    public void display() {

        NodeD n = head;
        while(n != null) {
            System.out.println("Node D is: " + n.value);
            n = n.next;
        }
    }

    public void delete() {
        head = head.next;
        head.prev = null;
    }
}
