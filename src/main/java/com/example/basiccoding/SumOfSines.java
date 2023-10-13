package com.example.basiccoding;

public class SumOfSines {
    public static void main(String[] args) {
        double degrees = 30;
        double radians = Math.toRadians(degrees);
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);
    }
}
