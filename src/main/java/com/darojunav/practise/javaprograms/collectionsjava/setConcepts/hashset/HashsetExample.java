package com.darojunav.practise.javaprograms.collectionsjava.setConcepts.hashset;

import java.util.HashSet;

public class HashsetExample {

    public static void main(String[] args) {
        /*
         duplicates are not allowed
         Insertion Order not preserved
         */
        HashSet<String> firstHashSet = new HashSet<>();
        firstHashSet.add("bunny");
        firstHashSet.add("sunny");
        firstHashSet.add("chinni");
        firstHashSet.add("bunny");
        firstHashSet.add("sunny");
        System.out.println(firstHashSet);
    }
}
