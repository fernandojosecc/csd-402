/**
 * Fernando Contreras
 * Assignment 1.3: Water Heating Energy Calculator
 * June 3, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This program calculates the energy needed to heat water
 * from an initial temperature to a final temperature using the formula:
 * Q = waterMass * (finalTemperature - initialTemperature) * 4184
 */

import java.util.Scanner;

public class WaterHeatingCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Let's calculate how much energy it takes to heat your water.");
        System.out.println();

        System.out.print("How much water do you have? (in kilograms): ");
        double waterMass = scanner.nextDouble();

        System.out.print("What's the starting temperature? (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("What temperature do you want to reach? (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate energy using Q = waterMass * (finalTemperature - initialTemperature) * 4184
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("\nAlright, here's what we got:");
        System.out.println("Water Mass:          " + waterMass + " kg");
        System.out.println("Initial Temperature: " + initialTemperature + " °C");
        System.out.println("Final Temperature:   " + finalTemperature + " °C");
        System.out.println("Energy Required:     " + Q + " Joules");

        scanner.close();
    }
}