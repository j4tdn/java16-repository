package utils;

import java.util.Scanner;

import bean.Condition;
import bean.Vehicle;

public class VehicleUtils {
	public static Vehicle[] importInfo() {
		do {
			try {
				Scanner ip = new Scanner(System.in);
				String numberAsString = inputVal("Nhập N: ", str -> isInteger(str));
				int number = Integer.parseInt(numberAsString);
				Vehicle[] vehicle = new Vehicle[number];

				for (int i = 0; i < number; i++) {
					vehicle[i] = new Vehicle();
					System.out.print("\nNhập chủ sở hữu: ");
					vehicle[i].setOwner(ip.nextLine());

					System.out.print("Nhập model: ");
					vehicle[i].setModel(ip.nextLine());

					String capacityAsString = inputVal("Nhập dung tích: ", str -> isInteger(str));
					vehicle[i].setCapacity(Integer.parseInt(capacityAsString));

					String priceAsString = inputVal("Nhập trị giá xe: ", str -> isDouble(str));
					vehicle[i].setPrice(Double.parseDouble(priceAsString));
				}
				return vehicle;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		} while (true);
	}

	public static void exportRegistrationTax(Vehicle[] vehicle) {
		if (vehicle == null) {
			System.out.println("Chưa có thông tin xe.");
			return;
		}

		System.out.println("\n2. Xuất bảng kê khai tiền thuế trước bạ của các xe.\n");
		System.out.printf("%-25s%-20s%10s%20s%20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(
				"\n=====================================================================================================");

		for (int i = 0; i < vehicle.length; i++) {
			System.out.println(vehicle[i]);
		}
	}

	private static boolean isInteger(String s) {
		return s.matches("[0-9]+");
	}

	private static boolean isDouble(String s) {
		return s.matches("[0-9]+[\\.]?[0-9]*");
	}

	private static String inputVal(String title, Condition con) {
		Scanner ip = new Scanner(System.in);
		String s = null;
		do {
			System.out.print(title);
			s = ip.nextLine();
		} while (!con.test(s));
		return s;
	}
}
