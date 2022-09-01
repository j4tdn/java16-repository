package polymorphism.object;

public class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Square -->draw ...");
		
	}
	@Override
	void claS() {
		System.out.println("Square --> cal S...");
		
	}
	void clear() {
		System.out.println("Square --> clear ...");
	}

}
