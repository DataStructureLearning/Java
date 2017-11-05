package com.company.Queue;

import com.company.LinkList.NodeD;

/**
 * Created by seyha on 11/3/17.
 */


public class QueueDoubleLinkList<T> {

    NodeD Rear;
    NodeD Front;

    public QueueDoubleLinkList() {
        Rear = null;
        Front = null;
    }

    public void Queue(Object value) {

        NodeD newItem = new NodeD(value, null, null);

        if(Rear == null || Front == null) {
            Rear = newItem;
            Front = newItem;
        } else {

           newItem.next = null;
           newItem.prev = Rear;
           Rear.next = newItem;
           Rear = newItem;
        }
    }



    public T DeQueue() {

        if(Rear == null || Front == null) {
            System.out.println("This is queue is empty!");
            return null;
        }

        T value = (T) Front.value;

        Front = Front.next;

        if(Front != null)
            Front.prev = null;

        return value;

    }

}
