package com.company.HashMap;

/**
 * Created by seyha on 11/1/17.
 */

public class HashTableArray<T> {

    int size;
    Entity[] hashArray;

    public HashTableArray(int size) {

        this.size = size;
        hashArray = new Entity[size];
        for(int i =0;i<size;i++) {
            hashArray[i] = new Entity();
        }
    }

    public int GetHashKey(int key) {
        return key%size;
    }

    public void put(int key, Object value) {

        int hashIndex = GetHashKey(key);
        Entity arrayValue = hashArray[hashIndex];

        Entity newItem = new Entity(key, value);


        newItem.next = arrayValue.next;
        arrayValue.next = newItem;

    }

    public T getValue(int key) {

        T value = null;

        int hashIndex = GetHashKey(key);
        Entity arrayValue = hashArray[hashIndex];

        while(arrayValue != null) {

            if(arrayValue.GetKey() == key){

                value = (T) arrayValue.GetValue();
                break;
            }

            arrayValue = arrayValue.next;
        }

        return value;
    }
}
