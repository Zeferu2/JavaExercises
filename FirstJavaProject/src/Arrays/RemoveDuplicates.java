package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array with duplicates
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Print the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }

    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] array) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        
        // Add all elements of the array to the HashSet
        for (int num : array) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
	}

}
