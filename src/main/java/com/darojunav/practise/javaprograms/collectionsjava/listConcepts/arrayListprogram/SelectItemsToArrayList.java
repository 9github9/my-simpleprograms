package com.darojunav.practise.javaprograms.collectionsjava.listConcepts.arrayListprogram;

import com.darojunav.practise.javaprograms.collectionsjava.model.Employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectItemsToArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> sampleArrayList = new ArrayList<>(Arrays.asList(
                new Employee(2l, "Edwin", LocalDate.of(2018, Month.APRIL, 24)),
                new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)),
                new Employee(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)),
                new Employee(3l, "David", LocalDate.of(2018, Month.APRIL, 25)),
                new Employee(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23))));

        ArrayList<Employee> remainingList = new ArrayList<>();

        sampleArrayList.
                stream().
                filter( employee ->  !employee.getName().equalsIgnoreCase("Alex")).
                forEachOrdered(remainingList::add);

        System.out.println(remainingList);
    }
}
