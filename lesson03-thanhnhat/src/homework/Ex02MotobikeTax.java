package homework;

import java.util.Scanner;

public class Ex02MotobikeTax {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Lê Văn An", "Future", 100, 35000000);
		Vehicle v2 = new Vehicle("Nguyễn Hoài Châu", "Ford Ranger", 3000, 125000000);
		Vehicle v3 = new Vehicle("Trần Anh", "Landscape", 1500, 1000000000);
		
		
		System.out.printf("%6s %15s %20s %15s %20s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		v1.printVC();
		v2.printVC();
		v3.printVC();
	}

}
