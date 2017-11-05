package com.company.search;

/**
 * Created by seyha on 11/4/17.
 */
public class BinarySearch {


    public static void main(String[] args) {

        DataSet dataSet = new DataSet(1000000);
        int search = 9999990;
        Boolean isFound = false;
        int low = 0;
        int high = dataSet.getSize() - 1;
        int mid = 0;

        while(!isFound) {

            dataSet.numberOfTry++;

            if(low > high) {
                System.out.println("number is not found!");
                break;
            }

            mid = low + ((high - low) / 2);

            if(dataSet.data[mid] == search) {
                System.out.println("Number is found after " + dataSet.numberOfTry + " try");
                break;
            }

            if(dataSet.data[mid] < search) {
                low = mid + 1;
            }

            if(dataSet.data[mid] > search) {
                high = mid - 1;
            }
        }
    }
}
