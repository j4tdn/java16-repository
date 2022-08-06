package datastructure;

public class Ex03ValuePass {

	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		
		salary = age;
		age = 24;
		
		System.out.println(age);
		System.out.println(salary);
		
		modify(salary);
		System.out.println(salary);

	}
	
	// JAVA PASS BY VALUE AT STACK
	// Review lương hàng năm
	// int salary -> danh sách tham số truy�?n vào, nhận giá trị bên ngoài
	private static void modify(int salary) {
		salary =  30;
	}

}
