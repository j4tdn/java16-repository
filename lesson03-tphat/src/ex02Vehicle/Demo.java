package ex02Vehicle;

import bean.Vehicle;

public class Demo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyen Thu Loan", "Future Neo", 100, 35000000.00);
		Vehicle v2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Nguyen Minh Triet", "Landscape", 1500, 1000000000);

		v1.show();
		v2.show();
		v3.show();
	}

}
