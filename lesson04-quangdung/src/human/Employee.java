package human;

public class Employee extends Person {

	private String department;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String date, float numOfSalary, String department) {
		super(name, date, numOfSalary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [department=" + department + ", getName()=" + getName() + ", getDate()=" + getDate()
				+ ", getNumOfSalary()=" + getNumOfSalary() + "]";
	}

	@Override
	public double calSalary() {
		return getNumOfSalary() * 1250000;
	}

	

	

}
