package salary;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainSlary extends President{
	public static void main(String[] args) {
		President da = new President();
		da.setName("gda");
		da.setDate(LocalDate.of(2022, 9, 3));
		da.setCoefficientsalary(3);
		da.setJobcoefficient(4);
		System.out.println(da.toString());
		
		User da1 = new President("gda", LocalDate.of(2022, 9, 3), 4, 3);
		System.out.println(da1.toString());
		
		User da2 = new Manager("gda1", LocalDate.of(2021, 3, 9), 2, 9);
		System.out.println(da2.toString());
		
		User da3 = new Employee("gda2", LocalDate.of(2020, 11, 26), 1, "Java");
		System.out.println(da3.toString());
		
		User da4 = new Employee("gda3", LocalDate.of(2020, 11, 26), 1, "Java1");
		System.out.println(da3.toString());
		
	    
		
	}

}
