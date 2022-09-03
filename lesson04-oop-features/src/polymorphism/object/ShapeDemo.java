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

		System.out.println("*********************");
		// compile: s1 --> Shape
		// runtime: s1 --> Rectangle
		Shape s1 = new Rectangle();
		s1.draw();
		s1.calS();

		// compile: s2 --> Shape
		// runtime: s2 --> Square
		Shape s2 = new Square();
		s2.draw();
		s2.calS();

		// TH1: Giup tao ra 1 tap hop cac kieu du lieu cha, con vao 1 tap hop de dang
		Shape[] shapes = { s1, s2, shape, rectangle, square };
		for (Shape shapeItem : shapes) {
			shapeItem.draw();
			shapeItem.calS();
//			shapeItem.clear();//Ham ko override thi khong goi nhu the nay duoc vi luc compile shapeItem chi la Shape thoi
			// Cach 1:
			if (shapeItem instanceof Square) {
				((Square) shapeItem).clear();
			}
			// Cach 2:
//			if (shapeItem != null && shapeItem.getClass() == Square.class) {
//				((Square) shapeItem).clear();
//			}
		}

		// TH2: De dang chuyen doi(trong pham vi cac class con) KDL luc runtime
		s1 = s2;
		s2 = s1;
		// TH2: Convention
	}
}