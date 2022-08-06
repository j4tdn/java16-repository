package datastructure;

public class Ex03ValuePass {
	public static void main(String[] args) {
		int age = 23;
		int salary = 10;
		//Làm 1 năm
		salary = age;
		age = 24;
	}
	private static void modify(int salary) {
		salary = 30;
		
	}

}
