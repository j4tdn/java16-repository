package homework;

import java.util.Scanner;

public class People {
	public String name, dateBorn;
	public double salaryFactor, positionFactor, salary;
	Scanner sc = new Scanner(System.in);

	public People() {
	}

	public People(String name, String dateBorn, double salaryFactor, double positionFactor, double salary) {
		super();
		this.name = name;
		this.dateBorn = dateBorn;
		this.salaryFactor = salaryFactor;
		this.positionFactor = positionFactor;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(String dateBorn) {
		this.dateBorn = dateBorn;
	}

	public double getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(double salaryFactor) {
		this.salaryFactor = salaryFactor;
	}

	public double getPositionFactor() {
		return positionFactor;
	}

	public void setPositionFactor(double positionFactor) {
		this.positionFactor = positionFactor;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", dateBorn=" + dateBorn + ", salaryFactor=" + salaryFactor
				+ ", positionFactor=" + positionFactor + ", salary=" + salary + "]";
	}

	private void enter() {
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter dateBorn: ");
		dateBorn = sc.nextLine();
		System.out.println("Enter salaryFactor: ");
		salaryFactor = Integer.parseInt(sc.nextLine());
		System.out.println("Enter PositionFactor: ");
		positionFactor = Integer.parseInt(sc.nextLine());
	}

	private int salary() {
		return 0;
	}

}
