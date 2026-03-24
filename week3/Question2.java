package week3;

public class Question2 {

	public static void main(String[] args) {
		
		double[] values = {10.5, 20.0, 33.2, 12.8, 15.5};
		
		double total = 0;
		
		for (double num : values) {
			total = total + num;
		}
		
		double avg = total / values.length;
		
		System.out.println("Sum: " + total);
		System.out.println("Average: " + avg);

	}

}