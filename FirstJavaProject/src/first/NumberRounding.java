package first;

import java.util.Scanner;

public class NumberRounding {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a double value
        System.out.print("Enter a double value: ");
        double number = scanner.nextDouble();
        
        // Truncate the double value to an integer (discard decimal part)
        int truncatedValue = (int) number;
        
        // Round the double value to the nearest integer
        long roundedValue = Math.round(number);
        
        // Display the results
        System.out.println("The truncated value is: " + truncatedValue);
        System.out.println("The rounded value is: " + roundedValue);
        
        scanner.close();
	}

}
