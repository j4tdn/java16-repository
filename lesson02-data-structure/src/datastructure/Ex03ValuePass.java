package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		
		salary = age;
		age=24;
		 System.out.println("age :"+ age); //24
		 System.out.println("salary :" + salary); //23
		 
		 modify(salary);
		 System.out.println("salary after review" + salary);

	}
//	JAVA PASS BY VALUE AT STACK
//	REVIEW LUONG HANG NAM
//	INT SALARY --> DANH SACH THAM SO TRUYEN VAO
//	NHAN GIA TRI TU BEN NGOAI
//	INT SALARY = SALARY
	private static void modify(int salary) {
		salary =30;
	}

}
