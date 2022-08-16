package ex02_Tax;

public class TaxUtils {
	public static void exportVehicleTaxList(Vehicle[] vehicles) {
		System.out.format("%-20s%-20s%10s%20s%20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
		System.out
				.println("==========================================================================================");
		for (Vehicle v : vehicles) {
			double taxPercent;
			int cylinder;
			if ((cylinder = v.getCylinder()) < 100)
				taxPercent = 0.01;
			else if (cylinder >= 100 && cylinder <= 200)
				taxPercent = 0.03;
			else
				taxPercent = 0.05;
			System.out.format("%-20s%-20s%10d%20.2f%20.2f\n", v.getNameOwner(), v.getNameVehicle(), cylinder,
					v.getPrice(), v.getPrice() * taxPercent);
		}
	}
}
