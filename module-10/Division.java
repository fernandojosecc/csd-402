/**
 * Fernando Contreras
 * Assignment 10.2: Division Class Hierarchy
 * July 25, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This abstract class defines the shared fields and
 * constructor for a company division. The display() method is abstract
 * and must be implemented by any subclass.
 */

public abstract class Division {

    private String divisionName;
    private String accountNumber;

    // Constructor requiring both fields
    public Division(String divisionName, String accountNumber) {
        this.divisionName  = divisionName;
        this.accountNumber = accountNumber;
    }

    // Getters
    public String getDivisionName() {
        return divisionName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method - defined in subclasses
    public abstract void display();
}