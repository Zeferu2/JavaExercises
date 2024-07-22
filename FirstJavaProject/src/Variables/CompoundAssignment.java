package Variables;

public class CompoundAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;

        // Use compound assignment operators to increase its value incrementally
        System.out.println("Initial value: " + number);

        // Add 5 to the variable
        number += 5;
        System.out.println("After += 5: " + number);

        // Subtract 2 from the variable
        number -= 2;
        System.out.println("After -= 2: " + number);

        // Multiply the variable by 3
        number *= 3;
        System.out.println("After *= 3: " + number);

        // Divide the variable by 4
        number /= 4;
        System.out.println("After /= 4: " + number);

        // Take the modulus of the variable by 3
        number %= 3;
        System.out.println("After %= 3: " + number);

	}

}
