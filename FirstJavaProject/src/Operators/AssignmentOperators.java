package Operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double number = 98.78;
        
        // Continuously halve the number using the assignment operator until it is less than 1
        while (number >= 1) {
            System.out.println("Current value: " + number);
            number /= 2; // number = number / 2;
        }
        
        System.out.println("Final value less than 1: " + number);
	}

}
