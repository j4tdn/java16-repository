package inheritance.finterface;

public class Rectangle implements Shape{
	//khi class implements interface 
	//bắt buộc phải 
	@Override
	public void draw() {
		System.out.println("rectangle draw");
	}
	@Override
	public void calS() {
		System.out.println("retangle cals");
	}

}
