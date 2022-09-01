package inheritance.finterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		rect.draw();
		rect.cals();
		
		// Shape: interface
		// Anonymous class: Lớp ẩn danh
		
		Shape shape = new Shape() {
			
			@Override
			public void draw() {
				System.out.println("Shape--> draw...");
			}
			
			@Override
			public void cals() {
				System.out.println("Shape--> cal S...");
			}
		};
		shape.draw();
		shape.cals();
			
		Shape shapeX = new X();
		shapeX.draw();
		shapeX.cals();
	}
}
