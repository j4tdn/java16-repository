package registerbuycar;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static void improtCar(Vehicle car) {
		System.out.print("Nhập tên chủ xe: ");
		car.setCarOwner(sc.nextLine());
		sc.nextLine();

		System.out.print("Nhập dung tích xe: ");
		car.setCapacity(sc.nextInt());

		System.out.print("Nhập trị giá xe: ");
		car.setValue(sc.nextDouble());
		;
		sc.nextLine();

		System.out.print("Màu xe: ");
		car.setColor(sc.nextLine());

	}

	public static void main(String[] args) {
		Vehicle v[] = null;
		int a, n = 0;
		boolean flag = true;
		do {
			System.out.println("Bạn chọn làm gì!!!");
			System.out.println("1.Tạo các đối tượng xe và nhập thông tin \n"
					+ "2.Xuất bảng kê khai tiền thuế của các xe.\n" + "Nhập số khác để thoát");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
				n = sc.nextInt();
				v = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Xe thứ " + (i + 1));
					v[i] = new Vehicle();
					improtCar(v[i]);
				}
				break;
			case 2:
				System.out.printf("%5s %5s %10s %10s %8s \n", "Chủ xe", "Dung tích", "Trị giá", "Màu xe", "Thuế");
				for (int i = 0; i < n; i++) {
					v[i].intax();
				}
				break;
			default:
				System.out.println("bye");
				flag = false;
				break;
			}
		} while (flag);
	}
}
