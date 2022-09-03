package ex04Humanresource;

import java.time.LocalDate;
import java.time.Month;

public class PersonDemo {

	public static void main(String[] args) {
		Direction dr = new Direction("Van A", LocalDate.of(2022, Month.NOVEMBER, 15), 5, 5);
		Manager mn = new Manager("Van B", LocalDate.of(2022, Month.MAY, 5), 4, 5);
		Employee ep1 = new Employee("Van C", LocalDate.of(2022, Month.AUGUST, 2), 3, "Phòng ban 1");
		Employee ep2 = new Employee("Van D", LocalDate.of(2022, Month.JUNE, 2), 3, "Phòng ban 2");

		System.out.println(dr + " salary " + dr.salary());
		System.out.println(mn + " salary " + mn.salary());
		System.out.println(ep1 + " salary " + ep1.salary());
		System.out.println(ep2 + " salary " + ep2.salary());

	}

}
