package polymorphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		shape.calS();
		
		System.out.println("rectangle====");
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.calS();
		
		System.out.println("==Square==");
		Square square = new Square();
		square.draw();
		square.calS();
		
		System.out.println("=========================");
		Shape s1 = rectangle;
		s1.draw();
		s1.calS();
		
		Shape s2 = new Square();
		s2.draw();
		s2.calS();
		// new x hoặc con của x
		
		// Giúp tạo ra 1 tập hợp các kiểu dữ liệu cha, con vào 1  tập hợp dễ dàng
		Shape[] shapes = {s1, s2, shape ,rectangle, square};
			for(Shape shapeItem : shapes) {
				shapeItem.draw();
				shapeItem.calS();
				//shapeItem instanceof Square
				if(shapeItem != null && shapeItem.getClass() == Square.class )
				{
					 Square runtimeShape = (Square)shapeItem;
					runtimeShape.clear();
				}
			}
		// TH2: dễ dàng chuyển đổi (trong phạm vi các class con) KDL lúc runtime
		s1 = s2; 
		s2 = s1;
		
		// TH2: Dễ dàng chuyển đổi (trong phạm vi )
	}
}
