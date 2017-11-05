package com.company.HashMap;

import com.company.HashMap.HashTableArray;

public class HashMapDemo {

    public static void main(String[] args) {
	// write your code here

        HashTableArray<String> hm = new HashTableArray<String>(4);
        hm.put(1,"Seyha");
        hm.put(2,"Soda");
        hm.put(3, "Seyyun");

        System.out.println(hm.getValue(2));
    }
}
