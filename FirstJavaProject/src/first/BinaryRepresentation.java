package first;
import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Convert the integer to binary representation
        String binaryRepresentation = Integer.toBinaryString(number);
        
        // Display the binary representation
        System.out.println("The binary representation of " + number + " is: " + binaryRepresentation);
        
        scanner.close();

	}

}
