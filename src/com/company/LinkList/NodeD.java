package com.company.LinkList;

/**
 * Created by seyha on 11/3/17.
 */
public class NodeD {

    public Object value;
    public NodeD next;
    public NodeD prev;

    public NodeD(Object value, NodeD next,NodeD prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
