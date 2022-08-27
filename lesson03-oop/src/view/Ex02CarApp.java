package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		// tạo 100 mẫu xe audi với các màu sắc khác nhau
		// màu sắc: yellow, red, blue, while, black
		Random rd = new Random();
		String[] colors = { "Yellow", "Red", "Blue", "While", "Black" };
		Car[] cars = new Car[100];
		Car.model = "Audi";
		for (int i = 0; i < cars.length; i++) {
			Car car = new Car(i, colors[rd.nextInt(colors.length)]);
			cars[i] = car;
		}
		// yêu cầu: số lượng xe còn lại đổi thành MG

		Car.model = "MG";

		System.out.println("==============================");
		for (Car car : cars) {
			System.out.println(car);
		}
	}
}