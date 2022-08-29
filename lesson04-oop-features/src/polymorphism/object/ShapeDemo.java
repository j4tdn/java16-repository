package polymorphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		System.out.println("=== Shape ===");
		Shape shape = new Shape();
		shape.draw();
		shape.calS();
		
		System.out.println("=== Rectangle ===");
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.calS();
		
		System.out.println("=== Square ===");
		Square square = new Square();
		square.draw();
		square.calS();
	}
}
