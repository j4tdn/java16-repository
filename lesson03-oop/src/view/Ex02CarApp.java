package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {
	public static void main(String[] args) {
		// Yeu cau: Tao 100 mau xe Audi voi cac mau sau khac nhau
		Random rd = new Random();
		String[] colors = { "Yellow", "Red", "Blue", "White", "Black" };
		Car[] cars = new Car[100];
		for (int i = 0; i < 100; i++) {
			Car.model = "Audi";
			Car car = new Car(i, colors[rd.nextInt(colors.length)]);
			cars[i] = car;
		}
		// Yeu cau: So luong xe con lai doi model thanh MG
		Car.model = "MG";
//		for (Car car : cars)
//			car.model = "MG";
		System.out.println("====================");
		for (Car car : cars) {
			System.out.println(car);
		}
	}
}
