package polymorsphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		shape.calS();

		System.out.println("=====Rectangle=====");
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.calS();

		System.out.println("=====Square=====");
		Square square = new Square();
		square.draw();
		square.calS();

		System.out.println("==========================");

		// compile: s1 --> Shape
		// runtime: s1 --> Rect
		Shape s1 = new Rectangle();
		s1.draw();
		s1.calS();

		// compile: s1 --> Shape
		// runtime: s1 --> Square
		Shape s2 = new Square();
		s2.draw();
		s2.calS();

		// giúp tạo 1 tập hợp các kdl cha , con vào 1 tập dễ dàng
		Shape[] shapes = { s1, s2, shape, rectangle, square };
		for (Shape shapeItem : shapes) {
			shapeItem.draw();
			shapeItem.calS();

			if (shapeItem != null && shapeItem.getClass() == Square.class) {
				Square runtimeShape = (Square) shapeItem;
				runtimeShape.clear();
			}
		}
		
		//TH2: Dễ dàng chuyển đổi (trong phạm vi các class con) kdl lúc runtime
		s1=s2;
		s2=s1;
	}

}
