import SolverGenerator.*;

public class MyFirstProgram {
	public static void main(String args[]) {
		
        // Initialize the lower and upper bounds by calling Generator's prepValues method
        Generator.prepValues();

        // Generate a random number to be guessed
        Generator.GenerateRandomNumber();

        // Call binary search solver to guess the random number
        Solver.binarySearchSolver();

	}
}
