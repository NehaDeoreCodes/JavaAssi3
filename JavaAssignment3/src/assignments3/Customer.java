package assignments3;

public class Customer {
	private String name;
    private String address;
    private String mobileNumber;
    private Account account;

    public Customer(String name, String address, String mobileNumber, Account account) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return account.withdraw(amount);
    }

    public String getAccountDetails() {
        String accountNumber = null;
		return "Account Number: " + accountNumber + ", Balance: $" + account.getBalance();
    }

    public void transfer(Customer recipient, double amount) {
        if (this.withdraw(amount)) {
            recipient.deposit(amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed due to insufficient balance");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Details: " + getAccountDetails());
    }

	
}

