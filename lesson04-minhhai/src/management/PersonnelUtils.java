package management;

public class PersonnelUtils {
	public static double salary(Personnel P) {
		double s = 0;
		if (P.getPosition() == "Giam Doc") {
			s = (P.getSalary() + P.getPositionCoef()) * 3000000;
		} else if (P.getPosition() == "Truong Phong") {
			s = P.getSalary() * 2200000;
		} else
			s = P.getSalary() * 12500000;
		return s;
	}
}
