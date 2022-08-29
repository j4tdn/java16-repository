package inheritance.finterface;

public class Rectangle implements Shape {
	
	//khi class implements interface
	//bat buoc override cac ham truu tuong

	@Override
	public void draw() {
		System.out.println("Rectangle --> draw");
		
	}

	@Override
	public void calS() {
		System.out.println("Rectangle --> CalS");
		
	}

}
