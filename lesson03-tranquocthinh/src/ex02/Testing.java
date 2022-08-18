package ex02;

public class Testing {
	public static void main(String[] args) {
		Vehicle vhc1 = new Vehicle("Nguyễn Công Phượng", "BMW I8", 200, 1500);
		Vehicle vhc2 = new Vehicle("Nguyễn Văn Toàn", "Audi A8L", 99, 1100);
		Vehicle vhc3 = new Vehicle("Đặng Văn Lâm", "Peugeot 3008", 500, 3500);
		Vehicle vhc4 = new Vehicle("Quế Ngọc Hải", "Porcher Macan", 550, 7500);
		Vehicle vhc5 = new Vehicle("Lâm Bình Chi", "Mazda Cx-5", 89, 1000);
		Vehicle vhc6 = new Vehicle("Lâm Chấn Khang", "Lexus Rx 350", 350, 2300);

		System.out.println(vhc1);
		System.out.println(vhc2);
		System.out.println(vhc3);
		System.out.println(vhc4);
		System.out.println(vhc5);
		System.out.println(vhc6);
	}
}
