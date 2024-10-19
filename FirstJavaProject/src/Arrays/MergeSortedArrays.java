package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example sorted arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Merge the two sorted arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged sorted array
        System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
    }

    // Method to merge two sorted arrays into a single sorted array
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        int i = 0, j = 0, k = 0;

        // Merge the arrays by comparing elements
        while (i < length1 && j < length2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements from array1, if any
        while (i < length1) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements from array2, if any
        while (j < length2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;

	}

}
