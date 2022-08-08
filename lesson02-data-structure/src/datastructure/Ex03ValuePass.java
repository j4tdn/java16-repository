package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;

		salary = age; // assign value
		age = 24;

		System.out.println("age: " + age);
		System.out.println("salary: " + salary);

		modifi(salary);
		System.out.println("salary after review: " + salary);
	}

	// java: pass by value at stack (truyền qua giá trị tại stack)
	// hàm Review lương hàng năm
	// int salary --> danh sách tham số truyền vào
	// nhận gá trị từ bên ngoài
	private static void modifi(int salary) {
		salary = 30;
	}
}
