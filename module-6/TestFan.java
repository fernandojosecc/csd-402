/**
 * Fernando Contreras
 * Assignment 6.2: Fan Class - Test Program
 * June 26, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This file tests the Fan class by creating two instances —
 * one using the default constructor and one using the argument constructor.
 * It demonstrates getters, setters, and the toString() method.
 */

public class TestFan {

    public static void main(String[] args) {

        // --- Fan 1: Default Constructor ---
        Fan fan1 = new Fan();
        System.out.println("========================================");
        System.out.println("  Fan 1 - Default Constructor");
        System.out.println("----------------------------------------");
        System.out.println("  " + fan1);

        // Modify fan1 using setters
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setColor("blue");
        fan1.setRadius(8);

        System.out.println("\n  After modifications:");
        System.out.println("  " + fan1);
        System.out.println("  Speed value : " + fan1.getSpeed());
        System.out.println("  Is on?      : " + fan1.isOn());
        System.out.println("  Radius      : " + fan1.getRadius());
        System.out.println("  Color       : " + fan1.getColor());

        System.out.println();

        // --- Fan 2: Argument Constructor ---
        Fan fan2 = new Fan(Fan.FAST, true, 12, "black");
        System.out.println("========================================");
        System.out.println("  Fan 2 - Argument Constructor");
        System.out.println("----------------------------------------");
        System.out.println("  " + fan2);

        // Turn fan2 off using setter
        fan2.setOn(false);
        fan2.setSpeed(Fan.STOPPED);

        System.out.println("\n  After turning off:");
        System.out.println("  " + fan2);
        System.out.println("  Speed value : " + fan2.getSpeed());
        System.out.println("  Is on?      : " + fan2.isOn());
        System.out.println("  Radius      : " + fan2.getRadius());
        System.out.println("  Color       : " + fan2.getColor());
        System.out.println("========================================");
    }
}