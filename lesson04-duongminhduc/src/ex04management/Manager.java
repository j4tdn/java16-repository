package ex04management;

public class Manager extends People{

	private int numberofemployees;

	public Manager()
	{
		
	}
	
	public Manager(int numberofemployees) {
		super();
		this.numberofemployees = numberofemployees;
	}
	

	public int getNumberofemployees() {
		return numberofemployees;
	}

	public void setNumberofemployees(int numberofemployees) {
		this.numberofemployees = numberofemployees;
	}
	


	@Override
	public String toString() {
		return "Manager [numberofemployees=" + numberofemployees + ", calSalary()=" + calSalary() + ", getName()="
				+ getName() + ", getDatebirth()=" + getDatebirth() + "]";
	}

	@Override
	public float calSalary() {
				
		return getSalary() * 2200000;
	}
	
	
}
