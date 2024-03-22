package Assessment1.seven;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a date
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String userInput = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Parse the user input into a LocalDate object using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputDate = LocalDate.parse(userInput, formatter);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Compare the input date with the current date
        int comparisonResult = inputDate.compareTo(currentDate);

        // Print the comparison result
        if (comparisonResult == 0) {
            System.out.println("The input date is equal to the current date.");
        } else if (comparisonResult < 0) {
            System.out.println("The input date is before the current date.");
        } else {
            System.out.println("The input date is after the current date.");
        }
    }
}

