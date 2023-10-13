package com.example.basiccoding;

public class ThreeSort {
    public static void main(String[] args) {
        int a = 17;
        int b = 50;
        int c = 33;

        // compute stats
        int min    = Math.min(a, Math.min(b, c));
        int max    = Math.max(a, Math.max(b, c));
        int median = a + b + c - min - max;

        // print stats
        System.out.println(min);
        System.out.println(median);
        System.out.println(max);
    }
}
