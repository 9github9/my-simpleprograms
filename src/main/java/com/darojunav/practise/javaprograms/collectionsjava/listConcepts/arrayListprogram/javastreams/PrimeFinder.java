package com.darojunav.practise.javaprograms.collectionsjava.listConcepts.arrayListprogram.javastreams;

import java.util.stream.IntStream;

public class PrimeFinder {
    public static void main(String[] args) {
        System.out.println("Helllo");
        IntStream.iterate(1, n -> n + 1)
            .skip(Integer.parseInt(args[0]))
            .limit(Integer.parseInt(args[1]))
            .forEach(System.out::println);
    }
}