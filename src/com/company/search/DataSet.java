package com.company.search;

/**
 * Created by seyha on 11/4/17.
 */
public class DataSet {

    int[] data;
    int numberOfTry;

    public DataSet(int size) {

        data = new int[size];

        numberOfTry = 0;

        for(int i=1 ; i <= size; i++) {
            data[i-1] = i;
        }
    }

    public int getSize() {
        return data.length;
    }

}
