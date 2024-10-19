package Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, -12, 6};

        // Number to find
        int target = 4;

        // Perform linear search
        int index = linearSearch(array, target);

        // Print the results
        if (index != -1) {
            System.out.println("Number " + target + " found at index " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

	}


