package ex04_humanresourcemanagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Member implements Info{
	public final Scanner ip = new Scanner(System.in);
	public static final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String fullname;
	private LocalDate birthday;
	private float coefSalary;
	
	public Member() {
	}
	
	public Member(String fullname, LocalDate birthday, float coefSalary) {
		this.fullname = fullname;
		this.birthday = birthday;
		this.coefSalary = coefSalary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public float getCoefSalary() {
		return coefSalary;
	}

	public void setCoefSalary(float coefSalary) {
		this.coefSalary = coefSalary;
	}
	
	@Override
	public void enterInfo() {
		System.out.println("Nhập họ tên: ");
		setFullname(ip.nextLine()); 
		System.out.println("Nhập ngày sinh(dd/MM/yyyy): ");
		setBirthday(LocalDate.parse(ip.nextLine(), df));
		System.out.println("Nhập hệ số lương: ");
		setCoefSalary(Float.parseFloat(ip.nextLine()));
	}
	
	@Override
	public String toString() {
		return String.format("%-20s%15s%20.2f%15.2f", fullname, birthday, coefSalary, payroll());
	}
	
	@Override
	public abstract double payroll();
}
