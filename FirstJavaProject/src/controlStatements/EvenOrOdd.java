package controlStatements;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = 9;

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

	}

}
