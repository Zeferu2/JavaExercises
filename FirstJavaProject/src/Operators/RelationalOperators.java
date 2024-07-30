package Operators;

public class RelationalOperators {
	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 29;
		if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            String result = (num1 > num2) ? "The first number is greater." : "The second number is greater.";
            System.out.println(result);
        }
	}

}
