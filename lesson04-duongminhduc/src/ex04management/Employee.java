package ex04management;

public class Employee extends People{

	private String unitname;
	public Employee()
	{
		
	}
	

	public String getUnitname() {
		return unitname;
	}


	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}


	public Employee(String unitname) {
		super();
		this.unitname = unitname;
	}


	@Override
	public String toString() {
		return "Employee [unitname=" + unitname + ", calSalary()=" + calSalary() + ", getName()=" + getName()
				+ ", getDatebirth()=" + getDatebirth() + "]";
	}


	@Override
	public float calSalary() {
		// TODO Auto-generated method stub
		return getSalary() * 3000000;
	}
	
	
}
