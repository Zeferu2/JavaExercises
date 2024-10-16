package Encapsulation;

public class SimpleBankAccount {
	 // Private fields (encapsulation)
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor 1: Default constructor
    public SimpleBankAccount() {
        this.accountHolderName = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
    }

    // Constructor 2: Constructor with account holder's name and account number
    public SimpleBankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;  // Default balance is 0
    }

    // Constructor 3: Constructor with all parameters
    public SimpleBankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter method for accountHolderName (Encapsulation)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method for accountHolderName (Encapsulation)
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter method for accountNumber (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for accountNumber (Encapsulation)
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance (Encapsulation)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Using default constructor
        SimpleBankAccount account1 = new SimpleBankAccount();
        account1.displayAccountDetails();  // Displays default details
        
        // Using constructor with name and account number
        SimpleBankAccount account2 = new SimpleBankAccount("John Doe", "123456");
        account2.displayAccountDetails();  // Displays details with name and account number

        // Using constructor with name, account number, and initial balance
        SimpleBankAccount account3 = new SimpleBankAccount("Alice Smith", "987654", 500.0);
        account3.displayAccountDetails();  // Displays details with all values

        // Modifying account details using setter methods (Encapsulation)
        account1.setAccountHolderName("Bob Brown");
        account1.setAccountNumber("555555");
        account1.deposit(300.0);
        account1.withdraw(50.0);
        account1.displayAccountDetails();  // Displays updated details
    }
}

	


