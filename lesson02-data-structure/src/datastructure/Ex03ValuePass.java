package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10; // M1

		// lam 1 nam
		salary = age; // assign value
		age = 24;

		System.out.println("age: " + age);// 24
		System.out.println("salary: " + salary);// 23

		Modify(salary);
		System.out.println("salary after review: " + salary);// 23

	}

	// JAVA PASS BY VALUE AT STACK

	// Review luong hang nam
	// int salary --> danh sach tham so truyen vao
	// nhan gia tri ben ngoai
	// int salary = salary
	private static void Modify(int salary) {
		salary = 30;
	}
}
