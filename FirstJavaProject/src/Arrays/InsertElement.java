package Arrays;

import java.util.Arrays;

public class InsertElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Element to insert and position
        int element = 10;
        int position = 2;  // Position is 0-based index

        // Insert the element
        int[] newArray = insertElement(array, element, position);

        // Print the new array
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }

    // Method to insert an element at a specified position in an array
    public static int[] insertElement(int[] array, int element, int position) {
        // Create a new array with one extra space
        int[] newArray = new int[array.length + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element at the specified position
        newArray[position] = element;

        // Copy the remaining elements after the position
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
	}

}
