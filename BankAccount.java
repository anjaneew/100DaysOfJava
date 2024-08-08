package dayFive;

public class BankAccount {
	int initialBalance;
	int interestRate;
	int loanAmount;
	int paymentDue;
	
	public  BankAccount(int initialBalance, int interestRate, int loanAmount) {
		this.initialBalance = initialBalance;
		this.interestRate = interestRate;
		this.loanAmount = loanAmount;
	}

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(5000, 8, 10000);
		myAccount.display();
		myAccount.deposit(1000);
		myAccount.withdraw(3000);
		myAccount.paybackLoan(500);
		myAccount.calculateMonthlyAmount(12);
		myAccount.balance(700);
}	
	public void display() {
		System.out.println("Initial balance: " + initialBalance
		+ "LKR  Interest rate: " + interestRate + "%  Loan amount: " 
				+ loanAmount + "LKR");
	}
	
	public void deposit(int depositAmount ) {
		initialBalance += depositAmount;
		System.out.println("The deposit amount is " + depositAmount
				+ "LKR  The new account balance is " + initialBalance);
	} 
	public void withdraw(int withdrawal) {
		initialBalance-= withdrawal;
		System.out.println("The withdrawal amount is " + withdrawal
				+ "LKR  The new account balance is " + initialBalance);
	}
	public void paybackLoan(int payBack) {
		paymentDue = (loanAmount * interestRate/100) + loanAmount ;
		System.out.println("The total loan payment due is: " + paymentDue + "LKR.");
		paymentDue-= payBack;
		System.out.println("When" + payBack + "LKR  amount is payed "
				+ "the total loan payment due now is:  " + paymentDue + "LKR.");
	}
	public void calculateMonthlyAmount(int months) {
		System.out.println ("When the loan amount due: " + paymentDue +
				" is payed in "+ months +" month period ");
		paymentDue /= months;
		System.out.println("the monthly loan payment due is: "+ 
				paymentDue +  " LKR");  
	}
	public void balance(int payments) {
		System.out.println("If the owner took "  + payments + " LKR per occation, from the "
				+ initialBalance + "LKR  the remaining balance in the account is?"
				+ " : " + (initialBalance %= 700));
	}
	
}