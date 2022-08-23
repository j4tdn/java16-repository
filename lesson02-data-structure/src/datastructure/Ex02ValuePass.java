package datastructure;

public class Ex02ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		// lam 1 nam
		salary = age;
		age = 24;
		System.out.println(age);
		System.out.println(salary);
		
		modify(salary);
		System.out.println("salary after review: "+salary);
	}
	// JAVA  PASS BY VALUE AT STACK
	//review luong hang nam
	// int salary --> danh sách tham số truyền vào
	// nhận giá trị từ bên ngoài 
	// int salary = salary
	private static void modify(int salary) {
		salary = 30;
	}
}
