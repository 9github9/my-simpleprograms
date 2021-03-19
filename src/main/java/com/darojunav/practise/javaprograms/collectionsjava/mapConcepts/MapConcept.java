package com.darojunav.practise.javaprograms.collectionsjava.mapConcepts;

import java.util.HashMap;

public class MapConcept {
    public static void main(String[] args) {

        /*
        Key value pairs
        Order is not preserved
        no duplicates keys are allowed
         */
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Apple");
        stringMap.put("Z", "Zebra");
        stringMap.put("Durga", "java");
        stringMap.put("B", "Boy");
        stringMap.put("T", "Tiger");

        System.out.println(stringMap);

    }


}
