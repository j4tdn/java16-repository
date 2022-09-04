package Ex04ManagementHuman;

import java.util.Date;

public class Person {
	private  String fullname;
	private Date birthDay;
	private double coefSalary;
	
	public Person() {
	}

	public Person(String fullname, Date birthDay, double coefSalary) {
		this.fullname = fullname;
		this.birthDay = birthDay;
		this.coefSalary = coefSalary;
	}


	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public double getCoefSalary() {
		return coefSalary;
	}

	public void setCoefSalary(double coefSalary) {
		this.coefSalary = coefSalary;
	}

	@Override
	public String toString() {
		return "Person [fullname: " + fullname + ", birthDay: " + birthDay + ", coefSalary: " + coefSalary + "]";
	}
	
	public long salary() {
		return 0;
	}
	
	
}