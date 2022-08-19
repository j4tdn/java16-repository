package vehicle;

public class App {

	public static void main(String[] args) {
		
		Vehicle vhc1 = new Vehicle("Duc", "BMW", 90, 1111111);
		Vehicle vhc2 = new Vehicle("Dud", "BMW", 190, 1111111);
		Vehicle vhc3 = new Vehicle("Duf", "BMW", 290, 1111111);
		Vehicle vhc4 = new Vehicle("Dug", "BMW", 50, 1111111);
		Vehicle vhc5 = new Vehicle("Duh", "BMW", 120, 1111111);
		Vehicle vhc6 = new Vehicle("Duj", "BMW", 240, 1111111);
		
		System.out.println("Tên chủ xe         Loại xe      Dung tích            Trị giá                Thuế phải nộp");
		System.out.println("=========================================================================================");
		System.out.println(vhc1);
		System.out.println(vhc2);
		System.out.println(vhc3);
		System.out.println(vhc4);
		System.out.println(vhc5);
		System.out.println(vhc6);
		
	}
}
