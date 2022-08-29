package molymorphism.object;

public class ShapeDemo {
	public static void main(String[] args) {
		System.out.println("==shape==");
		Shape shape = new Shape();
		shape.draw();
		shape.calS();
		
		System.out.println("==rectangle==");
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.calS();
		
		System.out.println("==square==");
		Square square = new Square();
		square.calS();
		square.draw();
		
		System.out.println("************");
		
		Shape s1 =  new Rectangle();
		s1.draw();
		s1.calS();
		
		Shape s2 = new Square();
		s2.calS();
		s2.draw();
		
		s1 = s2;
		
		System.out.println("*********");
		Shape[] shapes = {s1, s2, shape, rectangle, square};
		for (Shape shape2 : shapes) {
			shape2.draw();
			
			
			if(shape2 instanceof Square) {
				Square runtimeShape = (Square)shape2;
				runtimeShape.clear();
			}
			
			
			
		}
		
		// TH2 : De dang chuyen doi( trong pham vi class con)
		
		s1 = s2;
		s2 = s1;
		
		
		//TH2 : Convention
		
	}

}
