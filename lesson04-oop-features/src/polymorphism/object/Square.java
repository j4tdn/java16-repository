package polymorphism.object;

public class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Rectangle--> draw..calS()...");
	}
	@Override
	void calS() {
		System.out.println("Square--> cal S...");
		
	}
		void clear() {
			System.out.println("Square--> clear...");
		}
	

}
