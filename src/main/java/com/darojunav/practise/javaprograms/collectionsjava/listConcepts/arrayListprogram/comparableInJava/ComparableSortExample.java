package com.darojunav.practise.javaprograms.collectionsjava.listConcepts.arrayListprogram.comparableInJava;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableSortExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2l, "Edwin", LocalDate.of(2018, Month.APRIL, 24)));
        employees.add(new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
        employees.add(new Employee(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)));
        employees.add(new Employee(3l, "David", LocalDate.of(2018, Month.APRIL, 25)));
        employees.add(new Employee(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23)));

        Collections.sort(employees);
        int index = 0;
        while (employees.size() > index) {

            System.out.println(employees.get(index++));

        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
