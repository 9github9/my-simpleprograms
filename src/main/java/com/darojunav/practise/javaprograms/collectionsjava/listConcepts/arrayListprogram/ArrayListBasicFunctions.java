package com.darojunav.practise.javaprograms.collectionsjava.listConcepts.arrayListprogram;

import com.darojunav.practise.javaprograms.collectionsjava.model.User;

import java.util.*;

//Some methods are in the test classes
public class ArrayListBasicFunctions {
    public static void main(String[] args) {
        ArrayList<String> listStrings = new ArrayList<>(Arrays.asList("Fat", "Buddy", "Sticky", "hello", "how", "Are", "Buddy","alex","dough","gary","alex","harry"));// ArrayList with type safety
        listStrings.add("alex");
        listStrings.add("brian");
        listStrings.add("charles");

        /*
        to create an immutable arrayList we use this syntax and
         such arraylist doesnt provide add funcationality
         */
       // List<String> immutableArrayList = ("Naveen","Deleep","Nandu");
    //    immutableArrayList.add("kumars");

        System.out.println(listStrings.contains("alex"));
        // pending
        //listStrings.ensureCapacity();

        listStrings.forEach(s -> {
            System.out.println(s.toUpperCase());
        });

        System.out.println(listStrings.get(5));
        System.out.println("index of string brains in arraylist is"+listStrings.indexOf("brian"));

        System.out.println(listStrings.lastIndexOf("alex"));

        ArrayList ages = new ArrayList(); // ArrayList with out type safety will take anything
        ages.add("1");
        ages.add("2");
        ages.add(3);
        ages.remove("String");
        ages.add(1.12);

        User user = new User("fname", "lname", "rollno");

        ages.add(user);

        //ages.addAll(listStrings);// add all with out index
        ages.addAll(2, listStrings);// add all from index

        System.out.println(ages);

        ListIterator listIterator = listStrings.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.nextIndex();
            listIterator.previous();
            listIterator.next();
            listIterator.add("Naveen");
        }

        Iterator<String> iterator = listStrings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


            /*
            Concurrent modification Exception will be thrown if you try to modify the
            Underlying collection itself inside an iterator. the iterator methods should be used instead
            listStrings.remove("Naveen");
             */
        }

        //    ages.clear();
        //   System.out.println(ages);


        ArrayListBasicFunctions arrayListBasicFunctions = new ArrayListBasicFunctions();

        arrayListBasicFunctions.shallowcloneMyArrayList(listStrings);


        /*need to work on deep clone
        arrayListBasicFunctions.deepCloneMyArrayList(listStrings);
         */

    }

    /*
    ArrayList clone() method is used to create a shallow copy of the list. In the new list, only object references are copied.
    If we change the object state inside first arraylist, then changed object state will be reflected in cloned arraylist as well.
     */
    private ArrayList<String> shallowcloneMyArrayList(ArrayList<String> arrayList) {
        ArrayList<String> arrayList1 = (ArrayList<String>) arrayList.clone();
        return arrayList1;
    }

    private void deepCloneMyArrayList(ArrayList<String> arrayList) {
        ArrayList<String> deepCloneintothisArrayList = new ArrayList<>();

        Iterator<String> stringIterator = arrayList.iterator();

        while (stringIterator.hasNext()) {
            String next = (String) stringIterator.next();
        }

        System.out.print("my clone" + deepCloneintothisArrayList);

    }


}
