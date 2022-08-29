package inheritance.finterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		rect.draw();
		rect.calS();
		
		// Shape: interface
		// Anonymous class: Lớp ẩn danh
		Shape shape = new Shape() {
			
			@Override
			public void draw() {
				System.out.println("X --> draw ...");
			}
			
			@Override
			public void calS() {
				System.out.println("X --> cal S ...");
			}
		};
		shape.draw();
		shape.calS();
		
		Shape shapeX = new X();
		shapeX.draw();
		shapeX.calS();
	}
}
