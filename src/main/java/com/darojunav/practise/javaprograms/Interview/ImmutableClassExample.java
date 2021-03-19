package com.darojunav.practise.javaprograms.Interview;

/*
   To make a class immutable
   Make the class final
   Make the variables Private and final
   have all the fields set by the constrcutor
   and then no setters only Getters
 */
public final class ImmutableClassExample {
    private final String name;
    private final int regno;

    public ImmutableClassExample(String name, int regno) {
        this.name = name;
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public int getRegno() {
        return regno;
    }
}
