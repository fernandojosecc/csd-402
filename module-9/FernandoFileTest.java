/**
 * Fernando Contreras
 * Assignment 9.2: Random Number File I/O
 * July 15, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This program creates a file named data.file if it does
 * not already exist, then appends 10 randomly generated numbers to it,
 * each separated by a space. The file is closed, reopened, and its
 * contents are read and displayed.
 */

import java.io.*;
import java.nio.file.*;
import java.util.Random;

public class FernandoFileTest {

    public static void main(String[] args) {

        Path filePath = Paths.get("data.file");
        Random random = new Random();

        try {
            // Create the file if it does not already exist
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("data.file created.");
            } else {
                System.out.println("data.file already exists. Appending new numbers.");
            }

            // Write/append 10 randomly generated numbers separated by spaces
            BufferedWriter writer = new BufferedWriter(
                new FileWriter(filePath.toFile(), true) // true = append mode
            );

            StringBuilder numbers = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(100); // random number 0-99
                numbers.append(randomNum);
                if (i < 9) {
                    numbers.append(" ");
                }
            }
            numbers.append(System.lineSeparator());

            writer.write(numbers.toString());
            writer.close(); // Close the file after writing

            System.out.println("10 random numbers written to data.file.");
            System.out.println("----------------------------------------");

            // Reopen the file and read the data
            BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()));

            System.out.println("Contents of data.file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // Close the file after reading

        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }
    }
}