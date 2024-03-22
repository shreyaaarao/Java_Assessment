package Assessment1.eight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the desired date pattern
        String pattern = "MM-dd-yyyy";

        // Create a DateTimeFormatter with the specified pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        // Format the current date using the formatter
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date
        System.out.println("Formatted date: " + formattedDate);
    }
}

