package Arrays;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example array of characters
        char[] array = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};

        // Check if the array is a palindrome
        boolean isPalindrome = checkPalindrome(array);

        // Print the results
        if (isPalindrome) {
            System.out.println("The array forms a palindrome.");
        } else {
            System.out.println("The array does not form a palindrome.");
        }
    }

    // Method to check if the array is a palindrome
    public static boolean checkPalindrome(char[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false; // If mismatch found, it's not a palindrome
            }
            start++;
            end--;
        }
        return true; // If no mismatch, it's a palindrome
    }

	}


