package datastucture;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;

		//Lam 1 nam 
		salary = age;
		age = 24;
		
		System.out.println("age: "+age);//24
		System.out.println("salary: "+salary);//23
		
		modify(salary);
		
	}
	// Review luong hang nam
	// int salary --> danh sach tham so truyen vao
	// nhan gia tri tu ben ngoai
	// int salary = salary
	private static void modify(int salary) {
		salary = 30;
	}
}
