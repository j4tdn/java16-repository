package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		
		// lam 1 nam
		salary = age; // assign value
		age = 24;
		
		System.out.println("age : " + age);
		System.out.println("salary: " + salary);
		
		modify(salary);
		System.out.println("salary after review: " + salary);
	}
	
	// java pass by value at stack
	
	//review luong hang nam
	//int salary --> danh sach tham so truyen vao
	// nhan gia tri tu ben ngoai
	// int salary = salary
	// salary = 30
	private static void modify(int salary) {
		salary = 30;
	}
}
