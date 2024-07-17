package first;
import java.util.Scanner;
public class CharactersInput {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        
        // Determine the type of the character and display the result
        if (Character.isUpperCase(inputChar)) {
            System.out.println("The character is an uppercase letter.");
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("The character is a lowercase letter.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }
        
        scanner.close();
    }
}
