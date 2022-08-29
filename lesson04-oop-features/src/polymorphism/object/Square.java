package polymorphism.object;

public class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Rectangle --> draw...");
	}
	
	@Override
	void calS() {
		System.out.println("Rectangle --> cal S...");
	}
}
