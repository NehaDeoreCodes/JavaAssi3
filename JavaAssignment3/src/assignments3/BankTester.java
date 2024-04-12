package assignments3;

public class BankTester {

	public static void main(String[] args) {
		// Create accounts
        Account account1 = new Account(101, 5000);
        Account account2 = new Account(102, 7000);

        // Create customers
        Customer customer1 = new Customer("John Doe", "123 Main St", "1234567890", account1);
        Customer customer2 = new Customer("Jane Smith", "456 Oak St", "0987654321", account2);

        // Create bank
        Bank bank = new Bank();

        // Add customers to bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Display customer details
        bank.displayCustomerDetails();

        // Deposit and withdraw
        customer1.deposit(2000);
        customer2.withdraw(3000);

        // Transfer funds
        customer1.transfer(customer2, 1000);

        // Display updated customer details
        bank.displayCustomerDetails();

        // Apply interest
        bank.applyInterest(5); // 5% interest rate
        System.out.println("Interest applied");
        bank.displayCustomerDetails();
 

	}

}
