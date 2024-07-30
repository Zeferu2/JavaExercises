package Operators;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 15;

        // Demonstrating the use of compound assignment operators
        int result = number;

        // Using +=
        result += 5; // equivalent to result = result + 5;
        System.out.println("After += 5: " + result);

        // Using -=
        result -= 3; // equivalent to result = result - 3;
        System.out.println("After -= 3: " + result);

        // Using *=
        result *= 2; // equivalent to result = result * 2;
        System.out.println("After *= 2: " + result);

        // Using /=
        result /= 4; // equivalent to result = result / 4;
        System.out.println("After /= 4: " + result);


	}

}
