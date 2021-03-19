package com.darojunav.practise.javaprograms.collectionsjava.listConcepts.arrayListprogram.comparatorInJava;

import com.darojunav.practise.javaprograms.collectionsjava.model.Employee;

import java.util.Comparator;
 
public class NameSorter implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareToIgnoreCase(o1.getName());
    }
}