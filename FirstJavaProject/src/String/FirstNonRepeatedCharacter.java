package String;

import java.util.HashMap;

import java.util.Map;

public class FirstNonRepeatedCharacter {
	
	 public static Character findFirstNonRepeatedCharacter(String input) {
	        if (input == null || input.isEmpty()) {
	            return null; // Handle null or empty input
	        }

	        // Create a HashMap to store the count of each character
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the input string to lowercase
	        String lowerCaseInput = input.toLowerCase();

	        // Iterate through the string and update the count in the HashMap
	        for (char ch : lowerCaseInput.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Iterate through the string again to find the first non-repeated character
	        for (char ch : lowerCaseInput.toCharArray()) {
	            if (charCountMap.get(ch) == 1) {
	                return ch;
	            }
	        }

	        return null; // Return null if there is no non-repeated character
	    }

	    public static void main(String[] args) {
	        String testString = "Swiss";
	        Character result = findFirstNonRepeatedCharacter(testString);
	        if (result != null) {
	            System.out.println("The first non-repeated character is: " + result);
	        } else {
	            System.out.println("No non-repeated character found.");
	        }
	    }

}
