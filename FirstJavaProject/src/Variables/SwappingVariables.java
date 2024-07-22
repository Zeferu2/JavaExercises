package Variables;

public class SwappingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declare two integer variables and initialize them
        int a = 100;
        int b = 50;

        // Print initial values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the values without using a third variable
        a = a + b; // 150
        b = a - b; // 50
        a = a - b; //100

        // Print the swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);

	}

}
