package datastructure;

public class Ex03ValuePass {

	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		
		//làm 1 năm
		salary = age;
		age = 24;
		
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		
		modify(salary);
		System.out.println("salary after review: " + salary);
	}
	
	//Review lương hàng năm
	//int salary: danh sách tham số truyền vào
	private static void modify(int salary) {
		salary = 30;
	}

}
