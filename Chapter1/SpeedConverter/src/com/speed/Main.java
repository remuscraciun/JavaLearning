package com.speed;
import static com.speed.speedConverterOne.*;
import static com.speed.speedConverterTwo.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise one");
        System.out.println("----------------");
        System.out.println(speedConverterOne.toMilesPerHour(1.5));
        System.out.println(speedConverterOne.toMilesPerHour(10.25));
        System.out.println(speedConverterOne.toMilesPerHour(-5.6));
        System.out.println(speedConverterOne.toMilesPerHour(25.42));
        System.out.println(speedConverterOne.toMilesPerHour(75.114));
        System.out.println("\n");
        System.out.println("Exercise two");
        System.out.println("----------------");
        speedConverterTwo.printConversion(1.5);
        speedConverterTwo.printConversion(10.25);
        speedConverterTwo.printConversion(-5.6);
        speedConverterTwo.printConversion(25.42);
        speedConverterTwo.printConversion(75.114);
        System.out.println("\n");
    }
}
