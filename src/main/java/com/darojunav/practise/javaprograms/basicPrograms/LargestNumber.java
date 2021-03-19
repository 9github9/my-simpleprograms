package com.darojunav.practise.javaprograms.basicPrograms;

public class LargestNumber {

    public static void main(String[] args) {
        int[] a = new int[]{22, 3, 550, 4, 11, 100};
        int max = 0;

        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("the largest Number is " + max);
    }
}
