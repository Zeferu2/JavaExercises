package controlStatements;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user to enter two numbers
       
        double num1 = 100,num2=25;
        
        // Ask the user to choose an operator
        System.out.println("Choose an operator (+, -, *, /): +");
        
        char operator = '-';

        double result;

        // Perform the chosen operation and display the result
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
	}

}
