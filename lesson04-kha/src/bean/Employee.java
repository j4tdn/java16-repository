package bean;

import java.util.Scanner;

public class Employee extends People{
	String facultyName = "";
	
	@Override
	public void input() {
		System.out.println("-----NHẬP INFO NHÂN VIÊN------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên : ");
		this.name = sc.nextLine();
		System.out.print("Nhập ngày sinh : ");
		this.date = sc.nextLine();
		System.out.print("Nhập hệ số lương : ");
		this.salaryIndex = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập tên đơn vị(phòng/ban) : ");
		this.facultyName = sc.nextLine();
		
	}
	
	@Override
	public double getSalary() {
		return (this.salaryIndex)*1250000;
	}
}
