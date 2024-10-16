package UsingEnum;

public class EnumForDaysOfWeek {
	
	public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURADY

	}
	
	public static void main(String[] args) {
		
		Day day = Day.MONDAY;

		System.out.println(day.name());
		
	    Day Tuesday = Day.TUESDAY;
		

		System.out.println(day.compareTo(Tuesday));
	
	for (Day i:Day.values()) {
		System.out.println(i);
	}
		
	}
	
	
}




	
		
		
		


