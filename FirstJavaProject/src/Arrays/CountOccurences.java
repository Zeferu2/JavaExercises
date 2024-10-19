package Arrays;

public class CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example array and number to find
        int[] array = {1, 3, 5, 7, 3, 9, 3, 10, 3};
        int numberToFind = 3;

        // Find the number of occurrences
        int count = countOccurrences(array, numberToFind);

        // Print the result
        System.out.println("The number " + numberToFind + " occurs " + count + " times in the array.");
    }

    // Method to count the occurrences of a number in an array
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        return count;

	}

}
