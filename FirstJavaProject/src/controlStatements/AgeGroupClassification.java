package controlStatements;

public class AgeGroupClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Ask the user to enter their age
        System.out.print("Please enter your age: ");
        int age = 2;

        // Classify and display the age group
        if (age >= 0 && age <= 12) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("You are an adult.");
        } else if (age >= 60) {
            System.out.println("You are a senior.");
        } else {
            System.out.println("Invalid age entered.");
        }

	}

}
