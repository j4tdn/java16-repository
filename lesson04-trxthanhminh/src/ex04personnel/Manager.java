package ex04personnel;

import java.time.LocalDate;

public class Manager {
	private String fullName;
	private LocalDate date;
	private int numOfSalary;
	private int numOfEmployee;
	
public Manager() {
	// TODO Auto-generated constructor stub
}

public Manager(String fullName, LocalDate date, int numOfSalary, int numOfEmployee) {
	this.fullName = fullName;
	this.date = date;
	this.numOfSalary = numOfSalary;
	this.numOfEmployee = numOfEmployee;
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

public int getNumOfEmployee() {
	return numOfEmployee;
}

public void setNumOfEmployee(int numOfEmployee) {
	this.numOfEmployee = numOfEmployee;
}

@Override
public String toString() {
	return "Manager [fullName=" + fullName + ", date=" + date + ", numOfSalary=" + numOfSalary + ", numOfEmployee="
			+ numOfEmployee + "]";
}
public int salary() {
	return this.numOfSalary*2200000;
}
}	
