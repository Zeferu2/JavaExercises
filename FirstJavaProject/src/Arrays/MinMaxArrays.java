package Arrays;

import java.util.Arrays;

public class MinMaxArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example array
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, -12, 6};

        // Find maximum and minimum
        int max = findMax(array);
        int min = findMin(array);

        // Print the results
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    // Method to find the maximum element
    public static int findMax(int[] array) {
        int max = array[0]; // Assume the first element is the max
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is greater
            }
        }
        return max;
    }

    // Method to find the minimum element
    public static int findMin(int[] array) {
        int min = array[0]; // Assume the first element is the min
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if current element is smaller
            }
        }
        return min;
	}

}
