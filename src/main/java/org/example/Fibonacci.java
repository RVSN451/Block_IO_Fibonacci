package org.example;

public class Fibonacci {

    public static long myFibonacci(int n){

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } return myFibonacci (n - 2) + myFibonacci (n - 1);
    }
}