package com.company.HashMap;

/**
 * Created by seyha on 11/1/17.
 */

public class Entity {

    Object value;
    int key;
    Entity next;

    public Entity() {
        next = null;
    }

    public Entity( int key, Object value){
        this.value = value;
        this.key = key;
        this.next = null;
    }

    public int GetKey() {
        return key;
    }

    public Object GetValue() {
        return value;
    }
}
