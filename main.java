import java.util.Scanner;

public class MyFirstProgram {
 public static void main(String args[]) {
	 Scanner scannerInstance = new Scanner(System.in);
	 
	 System.out.print("Provide a random lower number: ");
	 int lowerNumber = scannerInstance.nextInt();
	 System.out.print("Provide a random upper number: ");
	 int upperNumber = scannerInstance.nextInt();
	 
	 int randomNumber = (int) Math.floor(Math.random() * (upperNumber - lowerNumber + 1)) + lowerNumber;
	 boolean isNumberFound = false;
	 
	 while(!isNumberFound) {
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
