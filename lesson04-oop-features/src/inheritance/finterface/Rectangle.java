package inheritance.finterface;

public class Rectangle implements Shape {
	// Khi class implement interface
	// Bat buoc phai override cac ham truu tuong tu interface
	@Override
	public void draw() {
		System.out.println("Rectangle --> draw ...");
	}

	@Override
	public void calS() {
		System.out.println("Rectangle --> calS ...");
	}
}
