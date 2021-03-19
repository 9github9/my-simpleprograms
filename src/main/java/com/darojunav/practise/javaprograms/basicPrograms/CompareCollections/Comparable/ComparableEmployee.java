package com.darojunav.practise.javaprograms.basicPrograms.CompareCollections.Comparable;

public class ComparableEmployee implements Comparable<ComparableEmployee> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public ComparableEmployee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public ComparableEmployee(int i, String madhuri) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public ComparableEmployee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableEmployee o) {
        return this.age - o.getAge();
    }
}
