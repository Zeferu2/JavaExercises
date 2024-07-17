package first;

import java.util.Scanner;

public class NumericalStringToNumberConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a numerical string
        System.out.print("Enter a numerical string: ");
        String input = scanner.nextLine();
        
        // Attempt to convert the string to an integer or double
        try {
            // First, try to convert the string to an integer
            int intValue = Integer.parseInt(input);
            System.out.println("The numerical string as an integer: " + intValue);
        } catch (NumberFormatException e1) {
            try {
                // If it fails, try to convert the string to a double
                double doubleValue = Double.parseDouble(input);
                System.out.println("The numerical string as a double: " + doubleValue);
            } catch (NumberFormatException e2) {
                // If both conversions fail, inform the user
                System.out.println("The input is not a valid numerical string.");
            }
        }

        scanner.close();
	}

}
