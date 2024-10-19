package String;

public class VowelsAndConstantsCounter {
	
	 public static void countVowelsAndConsonants(String input) {
	        if (input == null || input.isEmpty()) {
	            System.out.println("Input is null or empty.");
	            return;
	        }

	        // Convert the string to lowercase
	        String lowerCaseInput = input.toLowerCase();

	        // Initialize counters
	        int vowelCount = 0;
	        int consonantCount = 0;

	        // Define vowels
	        String vowels = "aeiou";

	        // Iterate through the string and count vowels and consonants
	        for (char ch : lowerCaseInput.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                if (vowels.indexOf(ch) != -1) {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        // Output the counts
	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	    }

	    public static void main(String[] args) {
	        String testString = "hello";
	        countVowelsAndConsonants(testString);
	    }
	

}
