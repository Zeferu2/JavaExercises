package first;

import java.util.Scanner;

public class CharArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a character
	        System.out.print("Enter a character: ");
	        char inputChar = scanner.next().charAt(0);
	        
	        // Calculate the next character in the sequence
	        char nextChar = (char) (inputChar + 1);
	        
	        // Display the next character
	        System.out.println("The next character is: " + nextChar);
	        
	        scanner.close();
	}

}
