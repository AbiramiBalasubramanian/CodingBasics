package com.example.basiccoding;

public class RandomInt {
    public static void main(String[] args) {
        // a positive integer
        int n = 1000;

        // a pseudo-random real between 0.0 and 1.0
        double r = Math.random();

        // a pseudo-random integer between 0 and n-1
        int value = (int) (r * n);

        System.out.println(value);
    }
}
