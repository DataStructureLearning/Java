package com.company.Queue;

/**
 * Created by seyha on 11/3/17.
 */
public class QueueArray<T> {

    int Front;
    int Rear;
    int size;
    Object[] arrayValues;

    public QueueArray(int size) {
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

        if(isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        Rear = Rear + 1;
        arrayValues[Rear] = value;

        if(Front == -1)  {
            Front = Front + 1;
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
