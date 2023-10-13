package com.example.basiccoding;

public class SumOfTwoDice {
    public static void main(String[] args) {
        //Generate 2 integers between 1 and 6, and print their sum.
        int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        System.out.println(sum);
    }
}
