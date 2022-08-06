package datastructure;

public class Ex03ValuePass {
	public static void main(String[] arges) {
		int age =23;
		int salary = 10;
		
		//làm 1 năm
		salary = age;
		age = 24;
		System.out.println(age);//24
		System.out.println(salary);//23
	
	    modify(salary);//M1
	    System.out.println("salary after review: " + salary);
	}
	// JAVA PASS BY VALUE
	// review lương hằng năm
	//int salary-->danh sách tham số truyền vào
	// nhận giá trị bên ngoài
	//int salary = salary
	//salary = 30
	private static void modify(int salary) { //M2
		salary = 30;
	}

}
