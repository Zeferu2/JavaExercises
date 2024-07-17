package first;

import java.util.Scanner;

public class BooleanLogic {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter a number
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    // Check if the number is even and less than 100
    boolean isEven = (number % 2 == 0);
    boolean isLessThanHundred = (number < 100);
    
    if (isEven && isLessThanHundred) {
        System.out.println("The number is both even and less than 100.");
    } else {
        System.out.println("The number is either not even or not less than 100.");
    }
    
    scanner.close();
}
}
