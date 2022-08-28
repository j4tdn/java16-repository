package polumorphims.object;

public class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Rectagle-->draw...");
	}

	@Override
	void calS() {
		System.out.println("Rectangle-->cal S...");
	}
}
