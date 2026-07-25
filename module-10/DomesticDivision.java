/**
 * Fernando Contreras
 * Assignment 10.2: DomesticDivision Class
 * July 25, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This class extends Division and adds a field for state.
 * Implements the display() method to show all division info.
 */

public class DomesticDivision extends Division {

    private String state;

    // Constructor requiring all fields
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Division Name : " + getDivisionName());
        System.out.println("Account #     : " + getAccountNumber());
        System.out.println("State         : " + state);
    }
}