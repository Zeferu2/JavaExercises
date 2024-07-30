package controlStatements;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user to enter a year
	        System.out.print("Enter a year: ");
	        int year = 2024;

	        // Check if the year is a leap year
	        boolean isLeapYear;
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    isLeapYear = true;
	                } else {
	                    isLeapYear = false;
	                }
	            } else {
	                isLeapYear = true;
	            }
	        } else {
	            isLeapYear = false;
	        }

	        // Display the result
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	}

}
