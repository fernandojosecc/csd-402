/**
 * Fernando Contreras
 * Assignment 7.2: UseFans Class
 * July 3, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This class creates a collection of Fan instances and
 * demonstrates displaying fan information without using toString().
 * Includes a method for displaying a collection of fans and a method
 * for displaying a single fan instance.
 */

import java.util.ArrayList;

public class UseFans {

    // --- Method: display a single Fan without toString() ---
    public static void displayFan(Fan fan) {
        String speedLabel;
        switch (fan.getSpeed()) {
            case Fan.SLOW:   speedLabel = "Slow";    break;
            case Fan.MEDIUM: speedLabel = "Medium";  break;
            case Fan.FAST:   speedLabel = "Fast";    break;
            default:         speedLabel = "Stopped"; break;
        }

        System.out.println("  Status : " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("  Speed  : " + speedLabel);
        System.out.println("  Radius : " + fan.getRadius());
        System.out.println("  Color  : " + fan.getColor());
    }

    // --- Method: display a collection of Fans without toString() ---
    public static void displayAllFans(ArrayList<Fan> fans) {
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("----------------------------------------");
            System.out.println("  Fan #" + (i + 1));
            System.out.println("----------------------------------------");
            displayFan(fans.get(i));
            System.out.println();
        }
    }

    // --- Test Program ---
    public static void main(String[] args) {

        // Create collection of Fan instances
        ArrayList<Fan> fanCollection = new ArrayList<>();

        fanCollection.add(new Fan());                          // default
        fanCollection.add(new Fan(Fan.SLOW,   true,  8,  "blue"));
        fanCollection.add(new Fan(Fan.MEDIUM, true,  10, "black"));
        fanCollection.add(new Fan(Fan.FAST,   true,  12, "red"));
        fanCollection.add(new Fan(Fan.STOPPED, false, 6, "white"));

        // Display all fans using collection method
        System.out.println("========================================");
        System.out.println("       ALL FANS IN COLLECTION");
        System.out.println("========================================");
        displayAllFans(fanCollection);

        // Demonstrate single fan display method
        System.out.println("========================================");
        System.out.println("  Single Fan Display - Fan #3");
        System.out.println("========================================");
        displayFan(fanCollection.get(2));

        // Demonstrate modifying a fan in the collection
        System.out.println();
        System.out.println("========================================");
        System.out.println("  Modifying Fan #1 and redisplaying...");
        System.out.println("========================================");
        fanCollection.get(0).setSpeed(Fan.FAST);
        fanCollection.get(0).setOn(true);
        fanCollection.get(0).setColor("green");
        fanCollection.get(0).setRadius(9);
        displayFan(fanCollection.get(0));
        System.out.println("========================================");
    }
}