package SolverGenerator;

public class Solver {

    // Binary search method to guess the number
    public static int binarySearchSolver() {
        int low = Generator.lowerNumber;
        int high = Generator.upperNumber;
        int guess;
        int attempts = 0;

        while (low <= high) {
            guess = low + (high - low) / 2;  // Middule value

            System.out.println("Attempt " + (attempts + 1) + ": Guessing number " + guess);

            if (guess == Generator.randomNumber) {
                System.out.println("GG! The number is: " + guess);
                return guess; // Successfully guessed
            } 
            else if (guess < Generator.randomNumber) {
                System.out.println("The guess is too low.");
                low = guess + 1; // Guess higher
            } 
            else {
                System.out.println("The guess is too high.");
                high = guess - 1; // Guess lower
            }

            attempts++;
        }

        return -1;
    }
}
