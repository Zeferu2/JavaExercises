package Operators;

public class LogicalOperators {
	public static void main(String[] args) {
	 int number = 30;
     
     // Check if the number is divisible by both 2 and 3 using logical operators
     boolean isDivisibleBy2 = (number % 2 == 0);
     boolean isDivisibleBy3 = (number % 3 == 0);
     
     if (isDivisibleBy2 && isDivisibleBy3) {
         System.out.println("The number is divisible by both 2 and 3.");
     } else {
         System.out.println("The number is not divisible by both 2 and 3.");
     }
  }
}
