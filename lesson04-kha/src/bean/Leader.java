package bean;

import java.util.Scanner;

public class Leader extends People {
	int countEmployeeManager;
	
	@Override
	public void input() {
		System.out.println("-----NHẬP INFO TRƯỞNG PHÒNG------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên : ");
		this.name = sc.nextLine();
		System.out.print("Nhập ngày sinh : ");
		this.date = sc.nextLine();
		System.out.print("Nhập hệ số lương : ");
		this.salaryIndex = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số lượng nhân viên quản lý : ");
		this.countEmployeeManager = Integer.parseInt(sc.nextLine());
	}
	
	@Override
	public double getSalary() {
		return (this.salaryIndex )*2200000;
	}
	
}
