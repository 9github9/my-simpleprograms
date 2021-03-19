package com.darojunav.practise.javaprograms.collectionsjava.listConcepts.arrayListprogram;

import com.darojunav.practise.javaprograms.collectionsjava.model.Employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> sampleArrayList = new ArrayList<>(Arrays.asList(
                new Employee(2l, "Edwin", LocalDate.of(2018, Month.APRIL, 24)),
                new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)),
                new Employee(2l, "Edwin", LocalDate.of(2018, Month.APRIL, 24)),
                new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)),
                new Employee(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)),
                new Employee(3l, "David", LocalDate.of(2018, Month.APRIL, 25)),
                new Employee(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23))));

        //Method 1:-

        List<Employee> checked = sampleArrayList
                .stream().
                        filter(p->!(
                                p.getName().equalsIgnoreCase("alex")||p.getName().equalsIgnoreCase("Edwin")))                               .collect(Collectors.toList());
        System.out.println(checked);


    }




}
