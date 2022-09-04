package ex04_humanresourcemanagement;

import java.time.LocalDate;

public class Manager extends Member{
	public static final double basicPay = 2200000;
	
	private int numberOfPersonnel;
	
	public Manager() {
	}
	
	public Manager(String fullname, LocalDate birthday, float coefSalary, int numberOfPersonnel) {
		super(fullname, birthday, coefSalary);
		this.numberOfPersonnel = numberOfPersonnel;
	}

	public int getNumberOfPersonnel() {
		return numberOfPersonnel;
	}

	public void setNumberOfPersonnel(int numberOfPersonnel) {
		this.numberOfPersonnel = numberOfPersonnel;
	}
	
	@Override
	public void enterInfo() {
		System.out.println("---- Quản lí ----");
		super.enterInfo();
		System.out.println("Nhập số lượng nhân viên quản lí: ");
		numberOfPersonnel = Integer.parseInt(ip.nextLine());
	}

	@Override
	public double payroll() {
		return getCoefSalary() * basicPay;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("\t%-5s", "Quản lí");
	}
}
