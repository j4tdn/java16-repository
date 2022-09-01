package polymorphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		System.out.println("====Shape====");
		Shape shape = new Shape();
		shape.draw();
		shape.cals();
		
		System.out.println("====Rectangle====");
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.cals();
		
		System.out.println("====Square====");
		Square square = new Square();
		square.draw();
		square.cals();
		
		System.out.println("****************");
		
		// compile: s1 --> Shape
		// runtime: s1 --> Rectangle
		Shape s1 = new Rectangle();
		s1.draw();
		s1.cals();
		
		// compile: s1 --> Shape
		// runtime: s1 --> Square
		Shape s2 = new Square();
		s2.draw();
		s2.cals();
		
		// TH1: Giúp tạo ra 1 tập hợp các kiểu dữ kiệu cha, con vào 1 tập hợp dễ dàng
		Shape[] shapes = {s1,s2, shape, rectangle, square};
		for(Shape shapeItem:shapes) {
			shapeItem.draw();
			shapeItem.cals();
			// shapeItem instanceof Square
			if (shapeItem != null && shapeItem.getClass() == Square.class) {
				Square runtimeShape = (Square)shapeItem;
				runtimeShape.clear();
			}
		}
		
		// TH2: Dễ dàng chuyển đổi (trong các phạm vi các class con) KDL lúc runtime
		s1 = s2;
		s2 = s1;
		
		// TH2: Convention
	}
}
