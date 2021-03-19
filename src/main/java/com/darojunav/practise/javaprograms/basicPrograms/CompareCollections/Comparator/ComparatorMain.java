package com.darojunav.practise.javaprograms.basicPrograms.CompareCollections.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<ComparatorEmployee> empList = Arrays.asList(new ComparatorEmployee(1, "Naveen", 25, 700000),
                new ComparatorEmployee(2, "Madhuri", 23, 70000000));
        Collections.sort(empList, Comparator.comparing(ComparatorEmployee::getName));
        Collections.sort(empList, Comparator.comparing(ComparatorEmployee::getId));
        Collections.sort(empList, Comparator.comparing(ComparatorEmployee::getAge));
       /* Greeting greeting = () -> System.out.println("Hello world");
        greeting.greet();*/
        empList.forEach(p -> System.out.println(p));

    }
}

interface Greeting {
    void greet();
}
