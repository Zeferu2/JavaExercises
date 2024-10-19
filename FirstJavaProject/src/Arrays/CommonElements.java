package Arrays;

import java.util.HashSet;

import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example arrays
        int[] array1 = {1, 3, 4, 7, 9};
        int[] array2 = {3, 5, 7, 8, 9};

        // Find common elements
        Set<Integer> commonElements = findCommonElements(array1, array2);

        // Print the common elements
        System.out.println("Common elements: " + commonElements);
    }

    // Method to find common elements between two arrays
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        // Use a HashSet to store elements from the first array
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        // Use another HashSet to store common elements
        Set<Integer> common = new HashSet<>();
        for (int num : array2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        return common;
	}

}
