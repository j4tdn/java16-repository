package humanresourcemanagement;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Director dr = new Director("Nhat Linh", LocalDate.of(1968, Month.NOVEMBER, 26), 5, 5);
		Manager mn = new Manager("Tan Phat", LocalDate.of(1979, Month.MAY, 5), 4, 5);
		Staff st1 = new Staff("Ngoc Quy", LocalDate.of(2003, Month.AUGUST, 23), 3, "Phòng 1");
		Staff st2 = new Staff("Van Duong", LocalDate.of(2000, Month.JUNE, 12), 3, "Phòng 2");

		System.out.println(dr + " salary " + dr.salary());
		System.out.println(mn + " salary " + mn.salary());
		System.out.println(st1 + " salary " + st1.salary());
		System.out.println(st2 + " salary " + st2.salary());
	}
}
