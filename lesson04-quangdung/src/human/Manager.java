package human;

public class Manager extends Person {
	private int numOfMaStaff;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String date, float numOfSalary, int numOfMaStaff) {
		super(name, date, numOfSalary);
		this.numOfMaStaff = numOfMaStaff;
	}

	public int getNumOfMaStaff() {
		return numOfMaStaff;
	}

	public void setNumOfMaStaff(int numOfMaStaff) {
		this.numOfMaStaff = numOfMaStaff;
	}
	
	@Override
	public String toString() {
		return "Manager [numOfMaStaff=" + numOfMaStaff + ", getName()=" + getName() + ", getDate()=" + getDate()
				+ ", getNumOfSalary()=" + getNumOfSalary() + "]";
	}

	@Override
	public double calSalary() {
		return getNumOfSalary() * 2200000;
	}
}
