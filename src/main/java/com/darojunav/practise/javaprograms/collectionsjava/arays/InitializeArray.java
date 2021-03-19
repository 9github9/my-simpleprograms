package com.darojunav.practise.javaprograms.collectionsjava.arays;

import java.util.Arrays;

public class InitializeArray {
    /*
    Arrays are also a subtype of Object in Java.
    Arrays are objects so we can find the length of the array using attribute 'length'.
    Java array are types. we can declare the variables of array type.
    Arrays are ordered and each have an index beginning from '0' for the first element.
    Arrays can store primitives as well as objects. But all must be of a single type in one array instance.
    Just like other variables, arrays can also be static, final or used as method arguments.
    The size of an array must be specified by an int value.
    Java arrays are Cloneable and Serializable.
    //Examples

    int[] numbers;

    String names[];

    int[][] cordinates;

    String nameSets[][];

     */
    public static void main(String[] args) {
        String[] array = new String[]{"First", "Second", "Third", "Fourth"};

        String[] arr1 = new String[]{"Fifth", "Sixth"};
        String[] arr2 = new String[]{"Seventh", "Eight"};

// An array of array containing String objects
        String[][] arrayOfArray = new String[][]{arr1, arr2};

// Print the nested array
        System.out.println(Arrays.deepToString(arrayOfArray));     //Correct way

// Print the array
        System.out.println(Arrays.toString(array));
    }
}


