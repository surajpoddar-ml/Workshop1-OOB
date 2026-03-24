package week3;

class MyBank {
	String holderName;
	double balance;
	String accountType;

	MyBank() {
		holderName = "Suraj Poddar";
		balance = 0.0;
		accountType = "Savings";
	}

	MyBank(String name, double amt) {
		holderName = name;
		balance = amt;
		accountType = "Savings";
	}

	MyBank(String name, double amt, String type) {
		holderName = name;
		balance = amt;
		accountType = type;
	}

	void display() {
		System.out.println("Holder: " + holderName + " | Balance: " + balance + " | Type: " + accountType);
	}
}

public class Question13 {

	public static void main(String[] args) {
		
		MyBank b1 = new MyBank();
		b1.display();

		MyBank b2 = new MyBank("Aryan Jha", 2500.50);
		b2.display();

		MyBank b3 = new MyBank("Sita Ray", 10000.0, "Current");
		b3.display();

	}

}