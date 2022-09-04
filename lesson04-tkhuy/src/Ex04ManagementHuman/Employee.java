package Ex04ManagementHuman;
import java.util.Date;
public class Employee extends Person {
	private String departmentName;
	
	public Employee() {
	}


	public Employee(String fullname, Date birthDay, double coefSalary, String departmentName) {
		super(fullname,birthDay,coefSalary);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Employee \n Fullname: " + getFullname() + "\n BirthDay: "+ getBirthDay() 
		+ "\n CoefSalary: " + getCoefSalary() + "\n Department Name: " + departmentName +" \n Salary: "+salary();
	}
	
	@Override
	public long salary() {
		return (long) (this.getCoefSalary() * 1250000);
	}
	
}