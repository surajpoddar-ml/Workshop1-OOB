package week3;

class MyAddress {
	private String street;
	private String city;
	private int zipCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String s) {
		street = s;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String c) {
		city = c;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int z) {
		zipCode = z;
	}
}

public class Question11 {

	public static void main(String[] args) {
		
		MyAddress addr = new MyAddress();
		
		addr.setStreet("Main Road");
		addr.setCity("Biratnagar");
		addr.setZipCode(56613);
		
		System.out.println("Address Details for Suraj Poddar:");
		System.out.println("Street: " + addr.getStreet());
		System.out.println("City: " + addr.getCity());
		System.out.println("Zip Code: " + addr.getZipCode());

	}

}