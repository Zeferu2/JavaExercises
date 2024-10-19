package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class KthLargestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array
        int[] array = {12, 3, 5, 7, 19, 4, 1, 8};

        // Input k value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.close();

        // Check if k is within the valid range
        if (k <= 0 || k > array.length) {
            System.out.println("Invalid value of k. It should be between 1 and " + array.length);
            return;
        }

        // Find the kth largest and kth smallest numbers
        int kthSmallest = findKthSmallest(array, k);
        int kthLargest = findKthLargest(array, k);

        // Print the results
        System.out.println("The " + k + "th smallest number is: " + kthSmallest);
        System.out.println("The " + k + "th largest number is: " + kthLargest);
    }

    // Method to find the kth smallest number
    public static int findKthSmallest(int[] array, int k) {
        // Sort the array
        Arrays.sort(array);
        // Return the kth smallest number (0-based index)
        return array[k - 1];
    }

    // Method to find the kth largest number
    public static int findKthLargest(int[] array, int k) {
        // Sort the array
        Arrays.sort(array);
        // Return the kth largest number
        return array[array.length - k];
	}

}
