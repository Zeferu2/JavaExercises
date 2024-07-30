package controlStatements;

public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user to enter a number from 1 to 7
       
        int dayNumber = 1;

        // Determine the corresponding day of the week
        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Error: Number outside the range (1-7).";
                break;
        }

        // Display the result
        System.out.println(day);

	}

}
