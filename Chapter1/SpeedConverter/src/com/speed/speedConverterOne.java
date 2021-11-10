package com.speed;
//1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This
// method needs to return the rounded value of the calculation of type long.
//
//        If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate
//        an invalid value.
//
//        Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion
//        and rounding, check the notes in the text below.
//
//        Examples of input/output:
//        * toMilesPerHour(1.5); → should return value 1
//        * toMilesPerHour(10.25); → should return value 6
//        * toMilesPerHour(-5.6); → should return value -1
//        * toMilesPerHour(25.42); → should return value 16
//        * toMilesPerHour(75.114); → should return value 47

public class speedConverterOne {

    static long toMilesPerHour(double kilometersPerHour) {

        double value;

        value = (kilometersPerHour < 0) ? -1 : (kilometersPerHour / 1.6);
        //value = ((double) value - (int) value) >= 0.5 ? (value+1) : value; Amateur method :))))

        return (long) Math.round(value);
    }
}
