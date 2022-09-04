package ex04_humanresourcemanagement;

import java.time.LocalDate;

public class Employee extends Member{
	public static final double basicPay = 1250000;
	
	private String department;
	
	public Employee() {
	}

	
	public Employee(String fullname, LocalDate birthday, float coefSalary, String department) {
		super(fullname, birthday, coefSalary);
		this.department = department;
	}



	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void enterInfo() {
		System.out.println("---- Nhân viên ----");
		super.enterInfo();
		System.out.println("Nhập tên đơn vị(phòng/ban): ");
		ip.nextLine();
	}
	
	@Override
	public double payroll() {
		return getCoefSalary() * basicPay;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("\t%-5s", "Nhân viên");
	}
}
