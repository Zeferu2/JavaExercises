package Arrays;

import java.util.Arrays;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, -12, 6};

        // Calculate the average
        double average = calculateAverage(array);

        // Print the results
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Average of elements: " + average);
    }

    // Method to calculate the average of elements in the array
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Add each element to the sum
        }
        return (double) sum / array.length; // Calculate the average
	}

}
