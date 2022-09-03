package polymorphism.object;

public class Rectangle extends Shape {

	@Override
	void draw() {

		System.out.println("rectangle-->draw...");
	}

	@Override
	void calS() {
		System.out.println("rectangle-->cal S...");
	}
}
