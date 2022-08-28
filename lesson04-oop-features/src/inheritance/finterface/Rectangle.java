package inheritance.finterface;

public class Rectangle implements Shape{
	//Khi class implement interface
	//Bắt buộc phải override các hàm trừu tượng từ interface
	@Override
	public void draw() {
		System.out.println("Rectangle-->draw...");
		
	}

	@Override
	public void calS() {
		System.out.println("Rectangle-->claS...");
	}
	
}
