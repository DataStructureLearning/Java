package com.company.sort;

/**
 * Created by seyha on 11/5/17.
 */


public class BubbleSort {

    public static void BubbleSort(int[] arr) {

        int size = arr.length;
        int temp = 0;

        for (int i =0;i<size-1;i++) {
            for(int j=1;j<size-i;j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {1,50,30,10,60,80};
        System.out.println("Before bubble sort");


        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i] + "\t");
        }


        System.out.println("");
        System.out.println("After bubble sort");
        BubbleSort(arr);

        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
