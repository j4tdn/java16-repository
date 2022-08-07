package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23 ;
		int salary = 10;
		// lam 1 nam 
		salary = age;
		age = 24;
		System.out.println(age);
		System.out.println(salary);
		modify(salary);
		System.out.println();
	}
	public static void modify( int salary) {
		salary = 30;
		
	}

}
