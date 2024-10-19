package Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        
        // Number of steps to rotate
        int steps = 3;
        
        // Print original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Rotate the array to the right by 'steps' positions
        rotateArray(array, steps);

        // Print rotated array
        System.out.println("Array after rotation: " + Arrays.toString(array));
    }

    // Method to rotate the array to the right
    public static void rotateArray(int[] array, int steps) {
        int length = array.length;
        // Handle cases where steps > length of array
        steps = steps % length;
        
        // Reverse the entire array
        reverseArray(array, 0, length - 1);
        
        // Reverse the first 'steps' elements
        reverseArray(array, 0, steps - 1);
        
        // Reverse the remaining elements
        reverseArray(array, steps, length - 1);
    }

    // Helper method to reverse a portion of the array
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

	}

}
