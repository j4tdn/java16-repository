package homework;

public class Employee extends People{
private String officeName;
public Employee() {
}

public Employee(String officeName) {
	this.officeName = officeName;
}

public String getOfficeName() {
	return officeName;
}
public void setOfficeName(String officeName) {
	this.officeName = officeName;
}
public void enter() {
	System.out.println("Enter Office name: ");
	officeName = sc.nextLine();
}
public void countSal() {
	salary = ((salaryFactor + positionFactor) * 125000);
}
@Override
public String toString() {
	return "Employee [salary=" + salary + "]";
}
}
