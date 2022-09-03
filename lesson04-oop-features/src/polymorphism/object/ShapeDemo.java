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
		
		System.out.println("*******************************");
		
		Shape s1 = new Rectangle();
		s1.draw();
		s1.calS();
		
		Shape s2 = new Square();
		s2.draw();
		s2.calS();
		
		System.out.println("*******************************");
		
		//TH1: giup tao ra 1 tap hop cac kieu du lieu cha , con vao 1 tap hop de dang
		Shape[] shapes = {s1,s2, shape , rectangle , square};
		for (Shape shapeItem:shapes) {
			shapeItem.draw();
			shapeItem.calS();
			
			//shapeItem instanceof Square
			if(shapeItem != null && shapeItem.getClass() == Square.class) {
				Square runtimeShape = (Square)shapeItem;
				runtimeShape.clear();
			}
		}
	}
}
