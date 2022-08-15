package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		// yêu cầu : tạo 100 mẫu xe audi với 100 màu khác nhau
		// Màu sắc: Yellow, red, blue, white, black
		String[] color = { "Yellow", "Red", "Blue", "White", "Black" };
		Random rd = new Random();
		Car[] cars = new Car[100];
		Car.model = "Audi";
		for (int i = 0; i < cars.length; i++) {
			Car car = new Car(i, "Audi", color[rd.nextInt(color.length)]);
			cars[i] = car;
			System.out.println(car);
		}

		// yêu cầu: Số lượng xe còn lại đổi model thành MG

		Car.model = "MG";
		System.out.println("===================");
		for (Car car : cars) {
			System.out.println(car);
		}
	}

}
