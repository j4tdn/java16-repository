package tax;

public class VehicleUltils {
	public static double tax(Information information) {
		double tax = 0;
		VehicleDetail vds = information.getVehicleDetail();
		int cap = vds.getCapacity();
		double cost = vds.getCost();
		if (cap < 100) {
			tax = cost - cost * 0.99;
		} else if (cap >= 100 && cap < 200) {
			tax = cost - cost * 0.97;
		}
		tax = cost - cost * 0.95;
		return tax;
	}
}
