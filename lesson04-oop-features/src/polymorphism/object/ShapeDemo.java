package polymorphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		System.out.println("=== Shape ===");
		Shape shape = new Shape();
		shape.draw();
		shape.claS();
		System.out.println("===Ractangle====");
		Rectangle rectangle = new Rectangle();
		rectangle.claS();
		rectangle.draw();
		System.out.println("===Square===");
		Square square = new Square();
		square.draw();
		square.claS();
		System.out.println("*****************");
		
		//compile: s1-->shape
		//runtime: s1-->Rectangle
		Shape s1 = new Rectangle();
		s1.draw();
		s1.claS();
		
		Shape s2 = new Square();
		s2.draw();
		s2.claS();
		//TH1: giúp mình tạo ra 1 tập hợp kiểu dữ liệu cha,con vào 1 mảng
		Shape[] shapes = {s1, s2, square, rectangle};
		for(Shape shapeItem:shapes) {
			shapeItem.draw();
			shapeItem.claS();
			
			if(shapeItem !=null && shapeItem.getClass() == Square.class) {
				Square runtimeShape = (Square)shapeItem;
				runtimeShape.clear();
			}
		}
	}
	//th2 dễ dàng chuyển đổi kiểu dữ liệu lúc runtime trong phạm vi các class con
	//th2 convention

}
