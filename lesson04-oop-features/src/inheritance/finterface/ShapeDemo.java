package inheritance.finterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		rect.draw();
		rect.claS();
		//Shape: interface
		//Annymous class: lớp ẩn danh
		Shape shape = new Shape() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void claS() {
				// TODO Auto-generated method stub
				
			}
		};
		shape.draw();
		shape.claS();
		
		Shape shapeX = new X();
		shape.draw();
		shape.claS();
		
	}

}
