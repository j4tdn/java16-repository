package management;

import java.time.LocalDate;
import java.time.Month;

public class AppManagement {
	public static void main(String[] args) {
		Personnel gd = new Personnel("Tran Van Viet", LocalDate.of(1992, Month.APRIL, 12), "Giam Doc", 2f, 1.5f);
		Personnel tp = new Personnel("Phan Van Linh", LocalDate.of(1994, Month.AUGUST, 8), "Truong Phong", 1.5f, 2);
		Personnel nv1 = new Personnel("Nguyen Ngoc Anh", LocalDate.of(1998, Month.JANUARY, 22), "Nhan vien 1", 1f,
				"Phong ban 1");
		Personnel nv2 = new Personnel("Nguyen Thu Thuy", LocalDate.of(1996, Month.MARCH, 22), "Nhan vien 2", 1f,
				"Phong ban 1");

		System.out.println(
				"Ho va ten" + "\t\t" + "Ngay sinh" + "\t\t" + "Chuc vu" + "\t\t" + "He so luong" + "\t\t" + "Luong");
		System.out.println(gd.getName() + "\t\t" + gd.getBirth() + "\t\t" + gd.getPosition() + "\t\t" + gd.getSalary()
				+ "\t\t" + PersonnelUtils.salary(gd));
		System.out.println(tp.getName() + "\t\t" + tp.getBirth() + "\t\t" + tp.getPosition() + "\t\t" + tp.getSalary()
				+ "\t\t" + PersonnelUtils.salary(tp));
		System.out.println(nv1.getName() + "\t\t" + nv1.getBirth() + "\t\t" + nv1.getPosition() + "\t\t"
				+ nv1.getSalary() + "\t\t" + PersonnelUtils.salary(nv1));
		System.out.println(nv2.getName() + "\t\t" + nv2.getBirth() + "\t\t" + nv2.getPosition() + "\t\t"
				+ nv2.getSalary() + "\t\t" + PersonnelUtils.salary(nv2));
	}
}
