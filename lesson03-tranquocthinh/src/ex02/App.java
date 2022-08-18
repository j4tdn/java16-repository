package ex02;

public class App {
	public static void main(String[] args) {
		Vehicle vhc1 = new Vehicle("Nguyễn Công Phượng", "Audi A8", 100, 1500);
		Vehicle vhc2 = new Vehicle("Đặng Văn Lâm", "Peugeot 3008", 99, 2250);
		Vehicle vhc3 = new Vehicle("Quế Ngọc Hải", "Porcher Macan", 500, 5500);
		Vehicle vhc4 = new Vehicle("Nguyễn Văn Toàn", "Mercedes benz glc 300", 350, 2558);
		Vehicle vhc5 = new Vehicle("Nguyễn Tuấn Anh", "Hyundai Santafe", 89, 1779);
		
		System.out.println(vhc1);
		System.out.println(vhc2);
		System.out.println(vhc3);
		System.out.println(vhc4);
		System.out.println(vhc5);
	}

}
