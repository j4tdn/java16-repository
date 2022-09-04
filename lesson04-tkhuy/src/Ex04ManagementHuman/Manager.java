package Ex04ManagementHuman;
import java.util.Date;
public class Manager extends Person {
	private int numOfManStaff;
	
	public Manager() {
	}

	public Manager(String fullname, Date birthDay, double coefSalary, int numOfManStaff) {
		super(fullname, birthDay, coefSalary);
		this.numOfManStaff = numOfManStaff;
	}

	public int getNumOfManStaff() {
		return numOfManStaff;
	}

	public void setNumOfManStaff(int numOfManStaff) {
		this.numOfManStaff = numOfManStaff;
	}
	
	
	
	@Override
	public String toString() {
		return "Manager \n Fullname: " + getFullname() + "\n BirthDay: "+ getBirthDay() 
		+ "\n CoefSalary: " + getCoefSalary() + "\n number of management staff: " + numOfManStaff  +" \n Salary: "+salary();
	}
	
	@Override
	public long salary() {
		return (long) (this.getCoefSalary() * 2200000);
	}
}