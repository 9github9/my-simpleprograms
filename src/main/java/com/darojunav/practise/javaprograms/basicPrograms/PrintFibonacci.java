package com.darojunav.practise.javaprograms.basicPrograms;

public class PrintFibonacci {
    public static void main(String[] args) {
        PrintFibonacci printFibonacci = new PrintFibonacci();
        printFibonacci.printFibonacci(10);
    }

    public void printFibonacci(int n) {
        int n1 = 0, n2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(n1);
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
