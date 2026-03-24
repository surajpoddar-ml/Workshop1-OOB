package week3;

class AccountInfo {
	private double balance;

	AccountInfo(double startAmt) {
		balance = startAmt;
	}

	public double getBalance() {
		return balance;
	}
}

public class Question10 {

	public static void main(String[] args) {
		
		AccountInfo myAcc = new AccountInfo(1500.0);
		
		System.out.println("Accessing private balance through getter...");
		System.out.println("Balance: " + myAcc.getBalance());

	}

}