package polymorphism.object;

public class Square extends Shape {

	@Override
	void draw() {

		System.out.println("rectangle-->draw...");
	}

	@Override
	void calS() {
		System.out.println("rectangle-->cal S...");
	}

	void clear() {
		System.out.println("Square-->clear");
	}
}
