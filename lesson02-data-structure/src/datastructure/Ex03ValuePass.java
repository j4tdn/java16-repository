package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		
		// Làm 1 năm 
		salary = age; //assign value
		age = 24; 
		
		System.out.println(age);
		System.out.println(salary);
		
		modify(salary);
		System.out.println("salary after review" + salary);
	}
	
	//Review lương hàng năm
	//int salary --> danh sách tham số truyền vào 
	// nhận giá trị từ bên ngoài
	// int salary = salary 
	// salary = 30; 
	private static void modify(int salary) {
		salary = 30;
		System.out.println("salary after review" + salary);
		
	}
}
