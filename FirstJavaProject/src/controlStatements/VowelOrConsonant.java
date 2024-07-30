package controlStatements;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user to enter a single character
        System.out.print("Enter a single character: ");
        char character = 'A';

        // Convert the character to lower-case for uniformity
        character = Character.toLowerCase(character);

        // Check if the character is a vowel or consonant
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println(character + " is a vowel.");
        } else if ((character >= 'a' && character <= 'z')) {
            System.out.println(character + " is a consonant.");
        } else {
            System.out.println("Error: Invalid input. Please enter an alphabetic character.");
        }

	}

}
