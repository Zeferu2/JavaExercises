package Operators;

public class RightAndleftShiftOPerators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte number = 10;//00001010

        // Perform left shift and right shift by 2 positions
        byte leftShiftResult = (byte) (number << 2);//00101000
        byte rightShiftResult = (byte) (number >> 2);//00000010

        // Print the results
        System.out.println("Original number: " + number);
        System.out.println("After left shift by 2: " + leftShiftResult);
        System.out.println("After right shift by 2: " + rightShiftResult);

        // Compare the results
        if (leftShiftResult > rightShiftResult) {
            System.out.println("Left shift result is greater than right shift result.");
        } else if (leftShiftResult < rightShiftResult) {
            System.out.println("Left shift result is less than right shift result.");
        } else {
            System.out.println("Left shift result is equal to right shift result.");
        }

	}

}
