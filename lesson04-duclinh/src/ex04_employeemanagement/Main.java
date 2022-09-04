package ex04_employeemanagement;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Director dr = new Director("duc linh", LocalDate.of(2002, 06, 18), 8, 4);
		Manager hdp = new Manager("huynh duc x", LocalDate.of(2002, 06, 23), 6, 7);
		Employee[] emp = new Employee[2];	
		emp[0] = new Employee("nguyen van a", LocalDate.of(1999, 07 , 9), 5, "Tester");
		emp[1] = new Employee("nguyen van b", LocalDate.of(2000, 04 , 9), 6, "Coder");
		System.out.println(dr.toString());
		System.out.println(hdp.toString());
		System.out.println(emp[0].toString());
		System.out.println(emp[1].toString());
	}
}
