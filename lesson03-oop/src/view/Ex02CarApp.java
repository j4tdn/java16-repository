package view;

import java.util.Random;

import bean.Car;

public class Ex02CarApp {

	private Object color;

	public static void main(String[] args) {
		// yêu cầu: tạo 100 mẫu xe audi với mầu sắt khác nhau
		Random rd = new Random();
		String[] color = {"yellow", "red", "blue", "white", "black"};
		Car[] cars = new Car[100];
		Car.model = "Audi";
		for (int i = 1; i < cars.length; i++) {
			Car car = new Car(i, "audi ", color[rd.nextInt(color.length)]);
		}
		
			Car.model = "MG";

		
		System.out.println("=========");
		for (Car car: cars) {
			System.out.println(car);
		}
	}

}
