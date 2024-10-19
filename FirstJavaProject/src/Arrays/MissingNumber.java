package Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Example array
	        int[] array = {1, 2, 4, 6, 3, 7, 8};  // Missing number is 5
	        
	        // Find the missing number
	        int missingNumber = findMissingNumber(array);
	        
	        // Print the result
	        System.out.println("The missing number is: " + missingNumber);
	    }

	    // Method to find the missing number
	    public static int findMissingNumber(int[] array) {
	        int n = array.length + 1;  // Size of the original array (including missing number)
	        
	        // Calculate the sum of numbers from 1 to n using the formula
	        int expectedSum = n * (n + 1) / 2;
	        
	        // Calculate the actual sum of the elements in the array
	        int actualSum = 0;
	        for (int num : array) {
	            actualSum += num;
	        }
	        
	        // The missing number is the difference between the expected sum and the actual sum
	        return expectedSum - actualSum;
	}

}
