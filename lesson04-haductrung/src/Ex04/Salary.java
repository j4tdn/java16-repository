package Ex04;

import java.time.LocalDate;

public class Salary {
	public static void main(String[] args) {
	director director=new director("hai",LocalDate.of(1999, 3, 20),10,5);
	Leader Leader=new Leader("long",LocalDate.of(1997, 15, 20),10,4);
	Employee Employee1=new Employee("chau",LocalDate.of(2001, 5, 22),10,2);
	Employee Employee2=new Employee("Trung",LocalDate.of(1999, 9, 21),10,2);
	
	
System.out.println("salary of director: " +director.salary());
System.out.println("salary of director: " +Leader.salary());
System.out.println("salary of director: " +Employee1.salary());
System.out.println("salary of director: " +Employee2.salary());


}
}
