package inheritance.finterface;

public class Rectangle implements Shape {
	
	//khi class implement interface
	//bắt buộc phải override các hàm trừu tượng từ interface

	@Override
	public void draw() {
	System.out.println("Rectange-->draw...");
		
	}

	@Override
	public void calS() {
		System.out.println("Rectange-->calS...");
		
	}

}
