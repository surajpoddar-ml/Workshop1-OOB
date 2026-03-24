package week3;

class Customer {
	private String id;
	private String name;
	private SurajAccount account;

	Customer(String customerId, String customerName, SurajAccount acc) {
		id = customerId;
		name = customerName;
		account = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getId() {
		return id;
	}

	public SurajAccount getAccount() {
		return account;
	}
}

public class Question12 {

	public static void main(String[] args) {
		
		SurajAccount s1 = new SurajAccount("Suraj Poddar", "ID-001", 5000.0);
		Customer c1 = new Customer("C001", "Suraj Poddar", s1);

		SurajAccount s2 = new SurajAccount("Aryan Jha", "ID-002", 2500.50);
		Customer c2 = new Customer("C002", "Aryan Jha", s2);

		System.out.println("Customer: " + c1.getName() + " | ID: " + c1.getId());
		System.out.println("Account Balance: " + c1.getAccount().balance);

		c2.setName("Aryan Sharma");
		System.out.println("Updated Name: " + c2.getName());

	}

}