package Operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 15;
        int c = 50;
        int d = 25;
        // ++a a=a+1
        // Pre-increment
        System.out.println("Pre-increment:");
        System.out.println("Original value of a: " + a);
        int preIncrement = ++a;// 
        System.out.println("Value after pre-increment: " + preIncrement);
        System.out.println("Current value of a: " + a);
        
        // Post-increment
        System.out.println("\nPost-increment:");
        System.out.println("Original value of b: " + b);
        int postIncrement = b++;// the original value of b = 15
        System.out.println("Value after post-increment: " + postIncrement);
        System.out.println("Current value of b: " + b);
        
        // Pre-decrement
        System.out.println("\nPre-decrement:");
        System.out.println("Original value of c: " + c);
        int preDecrement = --c;
        System.out.println("Value after pre-decrement: " + preDecrement);
        System.out.println("Current value of c: " + c);
        
        // Post-decrement
        System.out.println("\nPost-decrement:");
        System.out.println("Original value of d: " + d);
        int postDecrement = d--;
        System.out.println("Value after post-decrement: " + postDecrement);
        System.out.println("Current value of d: " + d);
	}

}
