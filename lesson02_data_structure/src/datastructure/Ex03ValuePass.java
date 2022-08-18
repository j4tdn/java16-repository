package datastructure;

public class Ex03ValuePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =23;
		int salary = 10;
		//làm 1 năm 
		salary =age;
		age =24;
		System.out.println(age);//24
		System.out.println(salary);//23
		
		modify(salary);
		System.out.println(salary);
	}
	
	private static void modify(int salary) {
		salary =30;
	
	}
}
