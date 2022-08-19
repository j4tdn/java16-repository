package Car;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle vh1 = new Vehicle("Nguyễn Thu Loan", "Future Neon", 100, 35000000);
		Vehicle vh2 = new Vehicle("Lê Minh Tính", "Ford Range", 3000, 250000000);
		Vehicle vh3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
		
		System.out.println("Tên chủ xe" + " " + "Loại xe:" + " " + "Dung Tích" + " " + "Trị giá" + " "
				+ "Thuế phải nộp");
		
		
		System.out.println("v1: "+ VehicleUtils.tax(vh1));
		System.out.println("v3: "+ VehicleUtils.tax(vh2));
		System.out.println("v2: "+ VehicleUtils.tax(vh3));


	}
}
