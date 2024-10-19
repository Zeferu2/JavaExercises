package String;

public class StringReverser {

	
		public static String reverseString(String input) {
	        // Check for null or empty input
	        if (input == null || input.isEmpty()) {
	            return input;
	        }
	        
	        // Convert the string to a character array
	        char[] charArray = input.toCharArray();
	        
	        // Initialize pointers for the start and end of the array
	        int left = 0;
	        int right = charArray.length - 1;
	        
	        // Swap characters while moving towards the middle of the array
	        while (left < right) {
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            left++;
	            right--;
	        }
	        
	        // Convert the character array back to a string and return
	        return new String(charArray);
	    }
	    
	    public static void main(String[] args) {
	        String original = "Hello, world!";
	        String reversed = reverseString(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }

	}


