package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		 int age = 23; 
		 int salary = 10;
		 // lam 1 nam
		 salary = age;
		 age = 24;
		 
		 System.out.println("age: " + age);
		 System.out.println("salary: " + salary);
		 
		 modify(salary);
		 System.out.println("salary after review: " + salary );
	}
	private static void modify(int salary) {
		// JAVA PASS BY VALUE AT STACK 
		//int salary --> danh sách tham số truyền vào 
		// nhận giá trị từ bên ngoài
		// review lương hàng năm 
		// int salary = salary
		salary = 30;
	}
}
