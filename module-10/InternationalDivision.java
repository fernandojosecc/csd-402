/**
 * Fernando Contreras
 * Assignment 10.2: InternationalDivision Class
 * July 25, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This class extends Division and adds fields for country
 * and language. Implements the display() method to show all division info.
 */

public class InternationalDivision extends Division {

    private String country;
    private String language;

    // Constructor requiring all fields
    public InternationalDivision(String divisionName, String accountNumber,
                                  String country, String language) {
        super(divisionName, accountNumber);
        this.country  = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("Division Name : " + getDivisionName());
        System.out.println("Account #     : " + getAccountNumber());
        System.out.println("Country       : " + country);
        System.out.println("Language      : " + language);
    }
}