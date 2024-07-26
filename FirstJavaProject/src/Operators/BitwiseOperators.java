package Operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 6;
        
        // Find the binary representation of the number
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binaryString);
        
        // Flip all the bits using bitwise NOT operator
        int flippedNumber = ~number;
        
        // Find the binary representation of the flipped number
        String flippedBinaryString = Integer.toBinaryString(flippedNumber);
        System.out.println("Flipped number: " + flippedBinaryString);
        
        // Handle the display of the flipped binary string to show only relevant bits
       // String displayFlippedBinaryString = flippedBinaryString.substring(flippedBinaryString.length() - binaryString.length());
        
     //   System.out.println("Flipped binary representation: " + displayFlippedBinaryString);
        System.out.println("Flipped number: " + flippedNumber);
	}

}
