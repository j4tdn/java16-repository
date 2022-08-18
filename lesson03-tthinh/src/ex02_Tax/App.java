package ex02_Tax;

public class App {

	public static void main(String[] args) {
		Vehicle vh1 = new Vehicle("Nguyễn Văn A", "Yamaha", 120, 1000);
		Vehicle vh2 = new Vehicle("Nguyễn Văn B", "Honda", 210, 1500);
		Vehicle vh3 = new Vehicle("Nguyễn Văn C", "SYM", 80, 800);

		System.out.println("Khách hàng 1: " + vh1 + vh1.tax(vh1));
		System.out.println("Khách hàng 1: " + vh2 + vh2.tax(vh2));
		System.out.println("Khách hàng 1: " + vh3 + vh3.tax(vh3));

	}

}
