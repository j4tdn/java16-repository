package polymorphism.object;

public class Rectangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("Rectangle--> draw...");
	}
	
	@Override
	void cals() {
		System.out.println("Rectangle--> cal S...");
	}
	
	
}
