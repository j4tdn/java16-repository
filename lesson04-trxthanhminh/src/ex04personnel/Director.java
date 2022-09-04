package ex04personnel;

import java.time.LocalDate;

public class Director {
	private String fullName;
	private LocalDate date;
	private int numOfSalary;
	private int jobCoefficient;
	
public Director() {
	// TODO Auto-generated constructor stub
}

public Director(String fullName, LocalDate date, int numOfSalary, int jobCoefficient) {
	this.fullName = fullName;
	this.date = date;
	this.numOfSalary = numOfSalary;
	this.jobCoefficient = jobCoefficient;
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

public int getJobCoefficient() {
	return jobCoefficient;
}

public void setJobCoefficient(int jobCoefficient) {
	this.jobCoefficient = jobCoefficient;
}

@Override
public String toString() {
	return "Director [fullName=" + fullName + ", date=" + date + ", numOfSalary=" + numOfSalary + ", jobCoefficient="
			+ jobCoefficient + "]";
}
public int salary() {
	return (this.numOfSalary + this.jobCoefficient)*3000000;
}
}
