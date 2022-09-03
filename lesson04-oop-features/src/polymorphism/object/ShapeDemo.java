package polymorphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		shape.calS();

		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.calS();

		Square square = new Square();
		square.draw();
		square.calS();

		System.out.println("****************");

		// compile: s1 -->Shape
		// runtime: s1 -->Rectangle
		Shape s1 = new Rectangle();
		s1.draw();
		s1.calS();

		// s1 -->Shape
		// s1 -->square
		Shape s2 = new Square();
		s2.draw();
		s2.calS();

		// giúp tạo ra 1taapj hợp các kiểu dữ liệu cha ,con vào 1 tập hợp rỗng
		Shape[] shapes = { s1, s2, shape, rectangle, square };
		for (Shape shapeItem : shapes) {
			shapeItem.draw();
			shapeItem.calS();

			// shapeItem instanceof Square
			if (shapeItem != null && shapeItem.getClass() == Square.class) {
				Square runtimeShape = (Square) shapeItem;
			}
		}

	}
	// TH2 :dễ dàng chuyển đổi (trong phạm vi các class con ) KDL lúc runtime

}
