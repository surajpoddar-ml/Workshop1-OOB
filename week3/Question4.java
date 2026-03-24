package week3;

class StudentAccount {
	String accountNumber;
	double balance;
	String accountHolderName;
	String accountHolderAddress;

	void showInfo() {
		System.out.println("Holder: " + accountHolderName);
		System.out.println("Account: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Address: " + accountHolderAddress);
	}
}

public class Question4 {

	public static void main(String[] args) {
		
		StudentAccount acc = new StudentAccount();
		
		acc.accountHolderName = "Maldini";
		acc.accountNumber = "123456789";
		acc.balance = 12000.50;
		acc.accountHolderAddress = "Itahari ko galli";
		
		System.out.println("Profile Created");
		acc.showInfo();

	}

}