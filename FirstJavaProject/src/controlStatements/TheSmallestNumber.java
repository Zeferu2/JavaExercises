package controlStatements;

public class TheSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Ask the user to enter three numbers
		int num1 =25,num2=10,num3=50;
		 // Determine the smallest number
        int smallest = num1;
        
        if (num2 < smallest) {
            smallest = num2;
        }
        
        if (num3 < smallest) {
            smallest = num3;
        }

        // Display the smallest number
        System.out.println("The smallest number is: " + smallest);


	}

}
