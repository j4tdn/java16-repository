package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		
		salary = age;
		age = 24;
		System.out.println("age: " + age );
		System.out.println("salary: " + salary);
		
		modify(salary);//M1
		System.out.println("salary after review: " + salary);
	}
	// JAVA PASS BY VALUE AT STACK
	
	// review luong hang nam
	// danh sach tham so truyen vao
	// nhan gia tri tu ben ngoai 
	// int salary = salary
	// salary = 30
	private  static void modify(int salary) {
		salary = 30;
	}
}
