/**
 * Fernando Contreras
 * Assignment 9.2: ArrayList Exception Handling
 * July 18, 2026
 * CSD-402: Java for Programmers
 */

import java.util.ArrayList;
import java.util.Scanner;

public class FernandoStringListTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create ArrayList with a minimum of 10 Strings
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Duarte");
        cities.add("Pasadena");
        cities.add("Los Angeles");
        cities.add("Santa Barbara");
        cities.add("Monrovia");
        cities.add("Arcadia");
        cities.add("Glendale");
        cities.add("Burbank");
        cities.add("Long Beach");
        cities.add("San Diego");

        // Print using for-each loop
        System.out.println("========================================");
        System.out.println("   City ArrayList");
        System.out.println("========================================");

        int index = 0;
        for (String city : cities) {
            System.out.println("  [" + index + "] " + city);
            index++;
        }

        // Ask the user which element they want to see again
        System.out.println("----------------------------------------");
        System.out.print("Enter the index of the element you want to view: ");

        // Autoboxing/Auto-unboxing: String input converted to Integer, then unboxed to int
        String userInput = scanner.nextLine();
        Integer userIndex = Integer.valueOf(userInput); // autoboxing (String -> Integer)

        try {
            // Auto-unboxing happens here (Integer -> int) when used with get()
            String selected = cities.get(userIndex);
            System.out.println("----------------------------------------");
            System.out.println("Element at index " + userIndex + ": " + selected);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("----------------------------------------");
            System.out.println("Exception thrown: Out of Bounds");
        }

        System.out.println("========================================");

        scanner.close();
    }
}