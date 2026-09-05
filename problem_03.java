// Variable scope demonstrator — compare local, instance, and static variable lifetimes across method calls.

public class problem_03 {
    // Class (static) variable: Shared across all instances
    static String bankName = "Global Tech Bank";
    
    // Instance variable: Unique to each object
    double balance;

    public void deposit(double amount) {
        // Local variable: Exists only within this method
        double transactionFee = 2.50; 
        this.balance += (amount - transactionFee);
        System.out.println("Deposited. Current balance: " + this.balance);
    }

    // The main method is required to execute the program
    public static void main(String[] args) {
        // Accessing the static variable
        System.out.println("Welcome to " + bankName);
        
        // Creating an object to use instance variables and methods
        problem_03 myAccount = new problem_03();
        
        System.out.println("Initial Balance: " + myAccount.balance);
        myAccount.deposit(100.0); // Simulating a $100 deposit
    }
}