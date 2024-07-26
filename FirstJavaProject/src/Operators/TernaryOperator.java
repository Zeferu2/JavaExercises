package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number = -25;
        
        // Determine if the number is positive, negative, or zero using the ternary operator
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        
        // Print the result
        System.out.println("The number is " + result);

	}

}
