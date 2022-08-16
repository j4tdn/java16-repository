package ex02_Tax;

public class App {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[] { new Vehicle("V1", "Nguyen Thu Loan", "Future Neo", 125, 35000000.00),
				new Vehicle("V2", "Tran Nhat Minh", "SH", 150, 85000000.00),
				new Vehicle("V3", "Barack Obama", "Ferrary SP48", 1000, 11035000000.00),
				new Vehicle("V4", "Donald Trump", "Honda Air Blade", 125, 55000000.00),
				new Vehicle("V5", "Nguyen Van A", "Wave Alpha", 100, 20000000.00),
				new Vehicle("V6", "Tim Cook", "Tesla Model X", 100, 7500000000.00) };

		TaxUtils.exportVehicleTaxList(vehicles);
	}
}
