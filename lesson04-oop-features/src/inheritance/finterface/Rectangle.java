package inheritance.finterface;

public class Rectangle implements Shape{

	//khi class implements interface
	//bắt buộc phải override các hàm trừu tượng từ interface
	@Override
	public void draw() {
		System.out.println("Rectangle --> draw ...");
		
	}

	@Override
	public void cals() {
		System.out.println("Rectangle --> cals ...");
		
	}
}