package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age =23;
		int salary = 10;
		// làm 1 năm
		salary = age;
		age = 24;
		
		System.out.println("Age: " + age);
		System.out.println("Salary: " +salary);
		
		modify(salary);
		System.out.println("Salary after review: " +salary);
	}
	//JAVA PASS BY VALUE AT STACK
	//review lương hàng năm
	//int salary => danh sách tham số truyền vào
	//nhận giá trị từ bên ngoài
	//int salary = salary (dòng 14)
	//salary = 30
	private static void modify(int salary) {
		salary = 30;
	}
}
