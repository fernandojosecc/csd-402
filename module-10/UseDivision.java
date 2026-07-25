/**
 * Fernando Contreras
 * Assignment 10.2: UseDivision Test Program
 * July 22, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This program creates two instances each of
 * InternationalDivision and DomesticDivision (4 total) and displays
 * their information using the display() method.
 */

public class UseDivision {

    public static void main(String[] args) {

        // Two InternationalDivision instances
        InternationalDivision intl1 = new InternationalDivision(
            "European Sales", "ACC-1001", "Germany", "German");

        InternationalDivision intl2 = new InternationalDivision(
            "Asia Pacific Operations", "ACC-1002", "Japan", "Japanese");

        // Two DomesticDivision instances
        DomesticDivision dom1 = new DomesticDivision(
            "West Coast Sales", "ACC-2001", "California");

        DomesticDivision dom2 = new DomesticDivision(
            "East Coast Operations", "ACC-2002", "New York");

        // Display all four instances
        System.out.println("========================================");
        System.out.println("  International Division #1");
        System.out.println("========================================");
        intl1.display();

        System.out.println("\n========================================");
        System.out.println("  International Division #2");
        System.out.println("========================================");
        intl2.display();

        System.out.println("\n========================================");
        System.out.println("  Domestic Division #1");
        System.out.println("========================================");
        dom1.display();

        System.out.println("\n========================================");
        System.out.println("  Domestic Division #2");
        System.out.println("========================================");
        dom2.display();

        System.out.println("========================================");
    }
}