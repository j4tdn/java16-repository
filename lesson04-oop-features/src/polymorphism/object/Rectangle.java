package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Rectangle--> draw..calS()...");
	}
	@Override
	void calS() {
		System.out.println("Square--> cal S...");
	}

}
