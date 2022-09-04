package homework;

public class Mangager extends People {
private int numberOfEmpl;
public Mangager() {
}

public Mangager(int numberOfEmpl) {
	super();
	this.numberOfEmpl = numberOfEmpl;
}

public int getNumberOfEmpl() {
	return numberOfEmpl;
}
public void setNumberOfEmpl(int numberOfEmpl) {
	this.numberOfEmpl = numberOfEmpl;
}
public void enter() {
	System.out.println("Enter Number Of Employee");
	numberOfEmpl = Integer.parseInt(sc.nextLine());
}
public void countSal() {
	salary = ((salaryFactor + positionFactor) * 220000);
}
@Override
public String toString() {
	return "Mangager [salary=]"+salary;
}


}
