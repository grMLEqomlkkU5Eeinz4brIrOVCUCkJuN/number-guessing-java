import java.util.Scanner;

public class MyFirstProgram {
	public static void main(String args[]) {
		Scanner scannerInstance = new Scanner(System.in);

		int upperNumber = 0;
		int lowerNumber = 0;
		
		boolean areNumericalContraintsDefined = false;
		while (!areNumericalContraintsDefined) {
            System.out.print("Provide a random lower number: ");
            if (scannerInstance.hasNextInt()) {
                lowerNumber = scannerInstance.nextInt();
                System.out.print("Provide a random upper number: ");
                if (scannerInstance.hasNextInt()) {
                    upperNumber = scannerInstance.nextInt();
                    areNumericalContraintsDefined = true; // Valid input, exit the loop
                } else {
                    System.out.println("Ensure that the upper number is an integer.");
                    scannerInstance.next(); // Consume the invalid input
                }
            } else {
                System.out.println("Ensure that the lower number is an integer.");
                scannerInstance.next(); // Consume the invalid input
            }
		}

		int randomNumber = (int) Math.floor(Math.random() * (upperNumber - lowerNumber + 1)) + lowerNumber;
		boolean isNumberFound = false;

		while (!isNumberFound) {
			System.out.print("I am thinking of a number, guess what that number is. >>> ");
			int userProvidedNumber = scannerInstance.nextInt();
			if (userProvidedNumber > randomNumber) {
				System.out.println("Lower");
			} else if (userProvidedNumber < randomNumber) {
				System.out.println("Higer");
			} else {
				System.out.println("GG You got it!");
				isNumberFound = true;
			}
		}

		scannerInstance.close();
	}
}
