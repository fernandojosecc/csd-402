/**
 * Fernando Contreras
 * Assignment 2.2: Rock-Paper-Scissors
 * June 10, 2026
 * CSD-402: Java for Programmers
 *
 * This program simulates a game of Rock-Paper-Scissors.
 * The computer randomly selects Rock, Paper, or Scissors, and the user
 * does the same. The program then displays both selections and the result.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Computer randomly picks 1, 2, or 3
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for their choice
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("--------------------------------");
        System.out.println("Enter your choice:");
        System.out.println("  1 = Rock");
        System.out.println("  2 = Paper");
        System.out.println("  3 = Scissors");
        System.out.print("Your pick: ");
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            scanner.close();
            return;
        }

        // Convert number choices to words
        String[] choices = {"", "Rock", "Paper", "Scissors"};
        String userSelection = choices[userChoice];
        String computerSelection = choices[computerChoice];

        // Display both selections
        System.out.println("\n--------------------------------");
        System.out.println("You picked:      " + userSelection);
        System.out.println("Computer picked: " + computerSelection);
        System.out.println("--------------------------------");

        // Determine the result
        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie!");
        } else if (
            (userChoice == 1 && computerChoice == 3) || // Rock beats Scissors
            (userChoice == 2 && computerChoice == 1) || // Paper beats Rock
            (userChoice == 3 && computerChoice == 2)    // Scissors beats Paper
        ) {
            System.out.println("Result: You win! Nice job!");
        } else {
            System.out.println("Result: Computer wins! Better luck next time!");
        }

        scanner.close();
    }
}