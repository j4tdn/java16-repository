package ex2_vehicle;

public class App {

	public static void main(String[] args) {

		Vehicle vhc1 = new Vehicle("David", "BMW", 500, 100000);
		Vehicle vhc2 = new Vehicle("Tony", "Mercedes-Benz", 130, 200000);
		Vehicle vhc3 = new Vehicle("Ana", "Toyota", 80, 30000);
		Vehicle vhc4 = new Vehicle("Lisa", "BMW", 170, 2000);
		Vehicle vhc5 = new Vehicle("Join", "Mercedes-Benz", 1000, 3000000);

		System.out.println("Tên chủ xe         Loại xe      Dung tích            Trị giá                Thuế phải nộp");
		System.out.println("=========================================================================================");
		System.out.println(vhc1);
		System.out.println(vhc2);
		System.out.println(vhc3);
		System.out.println(vhc4);
		System.out.println(vhc5);
	}
}

