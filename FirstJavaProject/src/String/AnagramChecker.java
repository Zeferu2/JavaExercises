package String;

import java.util.*;

public class AnagramChecker {
	
	public static boolean areAnagrams(String str1, String str2) {
        // Check for null inputs
        if (str1 == null || str1.length() == 0 ||str2 == null || str2.length() == 0) {
            return false;
        }

        
        // If the lengths of the cleaned strings are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the cleaned strings to character arrays
        char[] str1Array1 = str1.toCharArray();
        char[] str2Array2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(str1Array1);
        Arrays.sort(str2Array2);
        
        String result1 = "";
        for(char c: str1Array1) {
        	result1 = result1+c;
        }
        String result2 = "";
        for(char c: str2Array2) {
        	result2 = result2+c;
        }
        
        return result1.equalsIgnoreCase(result2);
    }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + result);
    }
}


