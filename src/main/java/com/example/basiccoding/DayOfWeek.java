package com.example.basiccoding;

public class DayOfWeek {
    public static void main(String[] args) {

        /*  Read in the month (m), day (d), and year (y) and print out what
            day of the week it falls on according to the Gregorian calendar.
            For M use 1 for January, 2 for February, and so forth. Outputs
            0 for Sunday, 1 for Monday, and so forth. */

        int m = 2;
        int d = 29;
        int y = 2000;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        System.out.println(d0);

    }

}
