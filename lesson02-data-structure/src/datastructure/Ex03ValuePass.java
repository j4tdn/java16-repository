package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		salary = age;
		age =24;
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		modify(salary);
		System.out.println("salary " + salary);
	}
	private static void modify(int salary) {
		 salary=30;
		 
	}

}
