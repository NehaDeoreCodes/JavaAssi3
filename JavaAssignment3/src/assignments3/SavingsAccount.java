package assignments3;

public class SavingsAccount {

	private static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;
	}

	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
}

