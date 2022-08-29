package molymorphism.object;

public class Square extends Shape {
	
	@Override
	void draw() {
		System.out.println("Square -->draw");
	}
	
	@Override
	void calS() {
		System.out.println("Square -- > calS");
	}
	
	void clear() {
		System.out.println("square --> clear ..");
	}
	


}
