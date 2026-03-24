package week3;

class MyBankAccount {
	String accountNumber;
	double balance;
	String accountHolderName;
	String accountHolderAddress;

	void displayDetails() {
		System.out.println("Name: " + accountHolderName);
		System.out.println("Account: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Address: " + accountHolderAddress);
	}
}

public class Question3 {

	public static void main(String[] args) {
		
		MyBankAccount account = new MyBankAccount();
		
		account.accountHolderName = "Suraj Poddar";
		account.accountNumber = "987654321";
		account.balance = 15000.50;
		account.accountHolderAddress = "Biratnagar, Nepal";
		
		account.displayDetails();

	}

}