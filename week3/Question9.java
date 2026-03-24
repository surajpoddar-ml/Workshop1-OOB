package week3;

class BoxVolume {
	double width;
	double height;
	double depth;

	BoxVolume() {
		width = 10;
		height = 8;
		depth = 12;
	}

	BoxVolume(double len) {
		width = height = depth = len;
	}

	BoxVolume(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	void getVolume() {
		double volume = width * height * depth;
		System.out.println("Volume: " + volume);
	}
}

public class Question9 {

	public static void main(String[] args) {
		
		BoxVolume b1 = new BoxVolume();
		b1.getVolume();

		BoxVolume cube = new BoxVolume(5);
		cube.getVolume();

		BoxVolume cuboid = new BoxVolume(4, 5, 6);
		cuboid.getVolume();

	}

}