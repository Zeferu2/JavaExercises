package Arrays;

import java.util.Arrays;

public class ReverseAray {
	public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Reverse the array
        reverseArray(array);

        // Print reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }
    }

}
