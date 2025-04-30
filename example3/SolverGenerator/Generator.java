package SolverGenerator;

import java.util.Scanner;

public class Generator {

    static int upperNumber = 0;
    static int lowerNumber = 0;
    static int randomNumber = 0;

    // Method to generate a random number within the provided bounds (lower and upper)
    public static void GenerateRandomNumber() {
        randomNumber = (int) Math.floor(Math.random() * (upperNumber - lowerNumber + 1)) + lowerNumber;
        System.out.println("Generated random number (for testing purposes): " + randomNumber);
    }

    // Method to initialize the guessing range
    public static void prepValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("We will now begin to select values for simulation.");
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Provide a random lower number: ");
            if (scanner.hasNextInt()) {
                lowerNumber = scanner.nextInt();
                System.out.print("Provide a random upper number: ");
                if (scanner.hasNextInt()) {
                    upperNumber = scanner.nextInt();
                    validInput = true; // Valid input, exit the loop
                } else {
                    System.out.println("Please provide a valid integer for the upper number.");
                    scanner.next(); // Consume invalid input
                }
            } else {
                System.out.println("Please provide a valid integer for the lower number.");
                scanner.next(); // Consume invalid input
            }
        }

        scanner.close();
    }
}
