package controlStatements;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get score
		int score = 75;

        // Determine the corresponding letter grade
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 50 && score <= 59) {
            grade = 'E';
        } else if (score < 50 && score >= 0) {
            grade = 'F';
        } else {
            System.out.println("Error: Invalid percentage score.");
           
            return;
        }

        // Display the result
        System.out.println("The corresponding letter grade is: " + grade);


	}

}
