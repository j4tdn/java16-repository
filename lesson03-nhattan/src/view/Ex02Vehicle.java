package view;

import java.util.Scanner;

import bean.Vehicle;
import utils.VehicleUtils;

/*
 *	Bài 2: Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. Dựa vào thông tin trị
	giá xe và dung tích xylanh, sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như
	sau:
	- Dưới 100cc, 1% trị giá xe.
	- Từ 100 đến 200cc, 3% trị giá xe.
	- Trên 200cc, 5% trị giá xe.
	Hãy thiết kế và cài đặt class Vehicle với các thuộc tính và phương thức phù hợp.
	Xây dựng class chứa hàm main. Thực hiện các công việc sau đây:
	1. Nhập thông tin và tạo N đối tượng xe
	2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
	3. Thoát chương trình.
 */

public class Ex02Vehicle {
	public static void main(String[] args) {
		createMenu();
	}

	private static void createMenu() {
		Vehicle[] vehicle = null;
		do {
			System.out.println("1. Nhập thông tin và tạo N đối tượng xe.");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("3. Thoát.");
			System.out.print("\n Nhập lựa chọn (1, 2, 3): ");

			char choose;
			choose = new Scanner(System.in).nextLine().charAt(0);

			switch (choose) {
			case '1':
				vehicle = VehicleUtils.importInfo();
				break;
			case '2':
				VehicleUtils.exportRegistrationTax(vehicle);
				break;
			case '3':
				return;
			default:
				System.out.println("Sai cú pháp.");
				break;
			}
			System.out.println(
					"\n=====================================================================================================");
		} while (true);
	}
}
