package com.company.Queue;

import java.util.Arrays;

/**
 * Created by seyha on 11/3/17.
 */
public class QueueDArray<T> {

    int Front;
    int Rear;
    int size;
    Object[] arrayValues;

    public QueueDArray(int size) {
        this.size = size;
        arrayValues = new Object[this.size];
        Front = -1;
        Rear = -1;
    }

    public boolean isEmpty() {
        return (Front == -1 || Front > Rear);
    }

    public boolean isFull() {
        return (Rear == size -1);
    }

    public void Queue(Object value) {

        EnsureCapacity(Rear + 2);

        Rear = Rear + 1;
        arrayValues[Rear] = value;

        if(Front == -1)  {
            Front = Front + 1;
        }
    }

    public void EnsureCapacity(int minCapacity) {

        int oldCapacity = arrayValues.length;
        if(minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;

            if(newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }

            arrayValues = Arrays.copyOf(arrayValues, newCapacity);
        }

    }


    public T DeQueue() {

        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        T value =  (T) arrayValues[Front];
        Front = Front + 1;
        return value;
    }
}
