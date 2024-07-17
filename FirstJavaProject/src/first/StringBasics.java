package first;
import java.util.Scanner;
public class StringBasics {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Print a greeting
        System.out.println("Hello, " + name + "!");
        
        // Find and print the length of the name
        int nameLength = name.length();
        System.out.println("The length of your name is: " + nameLength + " characters.");
        
        scanner.close();
    }
}

