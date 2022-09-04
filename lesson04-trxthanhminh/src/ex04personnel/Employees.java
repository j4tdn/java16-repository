package ex04personnel;

import java.time.LocalDate;

public class Employees {
	private String fullName;
	private LocalDate date;
	private int numOfSalary;
	private String department;
	
public Employees() {
	// TODO Auto-generated constructor stub
}

public Employees(String fullName, LocalDate date, int numOfSalary, String department) {
	this.fullName = fullName;
	this.date = date;
	this.numOfSalary = numOfSalary;
	this.department = department;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public int getNumOfSalary() {
	return numOfSalary;
}

public void setNumOfSalary(int numOfSalary) {
	this.numOfSalary = numOfSalary;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employees [fullName=" + fullName + ", date=" + date + ", numOfSalary=" + numOfSalary + ", department="
			+ department + "]";
}
public int salary() {
	return this.numOfSalary*1250000;
}
}
