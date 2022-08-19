package ex02;

public class App {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Nguyên Thu Loan", "Future Neo", 100, 35000000, 35000000 * 0.03);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 35000000, 35000000 * 0.05);
		Vehicle v3 = new Vehicle("Nguyên Minh Triết", "Future Neo", 1500, 25000000, 25000000 * 0.05);
		Vehicle v4 = new Vehicle("Nguyễn Đăng Khoa", "Future Neo", 1000, 25000000, 25000000 * 0.05);

//	System.out.printf("%20s%20s%5s%20s%20s","Tên chủ xe", "Loại xe","dung  tích","thuế phải nộp");;
		// System.out.println("=========================================================");

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
