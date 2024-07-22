package Variables;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string and store it in a variable
        String userInput = scanner.nextLine();

        // Print the input string
        System.out.println("You entered: " + userInput);

        // Close the scanner
        scanner.close();

	}

}
