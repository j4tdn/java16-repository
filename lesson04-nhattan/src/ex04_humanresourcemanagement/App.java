package ex04_humanresourcemanagement;

import java.time.LocalDate;

/**
 * Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
	a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
	b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý
	c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
	
	Chương trình thực hiện các công việc sau đây.
		Nhập dữ liệu gồm 1 Giám đốc, 1 Trưởng phòng, 2 Nhân viên
		Hiển thị thông tin các nhân sự có trong công ty
		Tính và in ra mức lương của từng loại nhân sự , biết rằng :
		Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
		Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
		Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
 */

public class App {
	public static void main(String[] args) {
		
		Member members[] = new Member[4];
		members[0] = new Director("Le Thi B", LocalDate.of(2000, 5, 12), 1.5f, 1.2f);
		members[1] = new Manager("Nguyen Van A", LocalDate.of(2000, 5, 11), 1.2f, 10);
		members[2] = new Employee("Tran Thi C", LocalDate.of(2000, 5, 10), 1.1f, "Ke toan");
		members[3] = new Employee("Le Thi D", LocalDate.of(2000, 5, 9), 1.1f, "Ke toan");
		
		
		System.out.printf("%-20s%15s%20s%15s\t%-15s", "Họ và tên", "Ngày sinh", 
													"Hệ số lương", "Lương", "Chức vụ");
		System.out.println();
		
		for (Member mem : members) {
			System.out.println(mem.toString());
		}
	}
}
