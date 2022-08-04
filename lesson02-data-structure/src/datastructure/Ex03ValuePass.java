package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10; // M1
		
		// Làm 1 năm
		salary = age; // assign value
		age = 24;
		
		System.out.println("age: " + age); // 24
		System.out.println("salary: " + salary); // 23
		
		modify(salary); // M1
		System.out.println("salary after review: " + salary); // 23 30
	}
	
	// JAVA PASS BY VALUE AT STACK
	
	// Review lương hàng năm
	// int salary --> danh sách tham số truyền vào
	// nhận giá trị từ bên ngoài
	// int salary = salary
	// salary = 30
	private static void modify(int salary) { // M2
		salary = 30;
	}
}
