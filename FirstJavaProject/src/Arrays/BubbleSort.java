package Arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Print original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort the array using Bubble Sort
        bubbleSort(array);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by the inner loop, then the array is sorted
            if (!swapped) {
                break;
            }
        }
	}

}
