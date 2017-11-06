package com.company.sort;

/**
 * Created by seyha on 11/5/17.
 */
public class SelectionSort {

    public static void SelectionSort(int[] arr) {

        int size = arr.length;
        int temp = 0;

        for (int i =0;i<size-1;i++) {

            int index = i;

            for(int j=i+1;j<size-1;j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }

            if(index != i) {
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {1,50,30,10,60,80};
        System.out.println("Before Selection sort");


        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i] + "\t");
        }



        System.out.println("\nAfter Selection sort");
        SelectionSort(arr);

        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
