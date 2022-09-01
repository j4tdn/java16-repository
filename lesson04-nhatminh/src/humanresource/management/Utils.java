package humanresource.management;

import humanresource.dto.Director;
import humanresource.dto.Employee;
import humanresource.dto.Manager;
import humanresource.dto.Personnel;

public class Utils {
	public static void showAllInfo(Personnel... personnels) {
		System.out.println("Danh sach nhan su trong cty:");
		for (Personnel personnel : personnels) {
			System.out.println(personnel);
		}
	}

	public static void showInfowithSalary(Personnel... personnels) {
		System.out.println("Danh sach luong cua nhan su:");
		for (Personnel personnel : personnels) {
			Double salary = 0.0;
			if (personnel instanceof Employee)
				salary = personnel.getSalaryCoefficient() * 1250000;
			else if (personnel instanceof Manager)
				salary = personnel.getSalaryCoefficient() * 2200000;
			else if (personnel instanceof Director)
				salary = (personnel.getSalaryCoefficient() + ((Director) personnel).getPositionCoefficient()) * 3000000;
			System.out.println(
					"Id: " + personnel.getId() + ", Name: " + personnel.getName() + ", Luong: " + salary.longValue());
		}
	}
}
