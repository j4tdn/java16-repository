package ex04humanresource;

import java.time.LocalDate;
import java.util.Date;

public class HumanResource {
	public static void main(String[] args) {
		Director dr = new Director("Tran Van A", LocalDate.of(1999, 02, 22), 10, 8);
		HeadOfDepartment hdp = new HeadOfDepartment("Nguyen Van B", LocalDate.of(1999, 02, 22), 7, 7);
		Employee em1 = new Employee("Phan Thi Anh C", LocalDate.of(1999, 02, 22), 5, "Marketing");
		Employee em2 = new Employee("Bui Anh D", LocalDate.of(1999, 02, 22), 5, "Accountant");

		System.out.println(dr.toString());
		System.out.println(hdp.toString());
		System.out.println(em1.toString());
		System.out.println(em2.toString());

	}
}
