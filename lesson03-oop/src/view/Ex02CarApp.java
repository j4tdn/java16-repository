package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {

	public static void main(String[] args) {
		// Yêu cầu: Tạo 100 mẫu xe Audi với các màu sắc khác nhau
		String[] colors = { "Yellow", "Red", "Blue", "White", "Black" };
		Random rd = new Random();
		Car[] cars = new Car[100];
		for (int i = 0; i < 100; i++) {
			Car car = new Car( colors[rd.nextInt(colors.length)], i);
			cars[i] = car;

		}

	
		// Yêu cầu số lượng xe còn lại đổi model thành MG

		Car.model = "MG";
		System.out.println("=====================");
		for (Car car : cars) {
//			car.model = "MG";
			System.out.println(car);
		}
	}
}
