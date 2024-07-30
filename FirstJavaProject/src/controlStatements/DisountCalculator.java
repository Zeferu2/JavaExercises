package controlStatements;

public class DisountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user to enter the total bill amount
        System.out.print("Enter the total bill amount: ");
        double totalBill = 400.75;

        double finalAmount = totalBill;

        // Apply the appropriate discount
        if (totalBill > 500) {
            finalAmount = totalBill * 0.80; // 20% discount
        } else if (totalBill > 200 && totalBill <= 500) {
            finalAmount = totalBill * 0.90; // 10% discount
        }

        // Display the final amount after discount
        System.out.println("The final amount after discount is: $" + finalAmount);


	}

}
