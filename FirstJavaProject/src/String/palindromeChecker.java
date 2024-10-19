package String;

public class palindromeChecker {
	
	 public static boolean isPalindrome(String input) {
	        // Check for null input
	        if (input == null) {
	            return false;
	        }

	        // Convert the string to lowercase and remove non-alphanumeric characters
	        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Initialize pointers for the start and end of the cleaned string
	        int left = 0;
	        int right = cleanedInput.length() - 1;

	        // Check if characters from the start and end match
	        while (left < right) {
	            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        // If all characters match, it is a palindrome
	        return true;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String testString = "A man, a plan, a canal, Panama!";
	        boolean result = isPalindrome(testString);
	        System.out.println("Is the string a palindrome? " + result);

	}

}
