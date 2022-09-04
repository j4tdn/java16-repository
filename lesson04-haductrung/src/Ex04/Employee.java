package Ex04;

import java.time.LocalDate;

public class Employee {
	private String Fullname;
	private LocalDate birthday;
	private int HSL;
	private int Department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String Fullname, LocalDate birthday, int HSL, int Department) {
		this.Fullname=Fullname;
		this.birthday=birthday;
		this.HSL=HSL;
		this.Department=Department;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public int getHSL() {
		return HSL;
	}
	public void setHSL(int hSL) {
		HSL = hSL;
	}
	public int getDepartment() {
		return Department;
	}
	public void setDepartment(int Department) {
		Department = Department;
	}
	@Override
	public String toString() {
		return "director [Fullname=" + Fullname + ", birthday=" + birthday + ", HSL=" + HSL + ", HSCV=" + Department + "]";
	}
	public double salary() {
		return this.HSL*1250000;
	}
	
	

}
