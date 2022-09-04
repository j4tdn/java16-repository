package bean;

import java.util.Scanner;

public class Director extends People {
	
	int positionIndex = 0;
	
	@Override
	public void input() {
		System.out.println("-----NHẬP INFO GIÁM ĐỐC------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên : ");
		this.name = sc.nextLine();
		System.out.print("Nhập ngày sinh : ");
		this.date = sc.nextLine();
		System.out.print("Nhập hệ số lương : ");
		this.salaryIndex = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập hệ số chức vụ : ");
		this.positionIndex = Integer.parseInt(sc.nextLine());
		
	}
	
	@Override
	public double getSalary() {
		return (this.salaryIndex + this.positionIndex)*3000000;
	}
}
