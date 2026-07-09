/**
 * Fernando Contreras
 * Assignment 8.2: ArrayList Max Value
 * July 8, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This program accepts integers from the user and adds them
 * to an ArrayList until 0 is entered. The ArrayList is then passed to a
 * method that returns the largest value. If the ArrayList is empty, the
 * method returns 0. An additional method counts how many odd numbers
 * the list contains.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class FernandoArrayListTest {

    // --- Method: returns the largest value in the ArrayList ---
    public static Integer max(ArrayList list) {

        // Return 0 if the list is empty
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    // --- Additional Method: counts the odd numbers in the ArrayList ---
    public static int countOdd(ArrayList list) {

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    // --- Test Program ---
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList list  = new ArrayList();

        System.out.println("========================================");
        System.out.println("   ArrayList Max Value Finder");
        System.out.println("========================================");
        System.out.println("Enter integers one at a time.");
        System.out.println("Enter 0 to stop.");
        System.out.println("----------------------------------------");

        // Collect user input until 0 is entered
        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            list.add(input);
            if (input == 0) {
                break;
            }
        }

        // Display the ArrayList contents and results
        System.out.println("----------------------------------------");
        System.out.println("Numbers entered: " + list);
        System.out.println("Largest value:   " + max(list));
        System.out.println("Odd numbers:     " + countOdd(list));
        System.out.println("========================================");

        scanner.close();
    }
}